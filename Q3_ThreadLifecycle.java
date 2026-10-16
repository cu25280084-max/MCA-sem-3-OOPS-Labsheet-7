public class Q3_ThreadLifecycle {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(500);
                System.out.println("Thread task running");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        System.out.println("Before start: " + t.getState()); // NEW
        t.start();
        System.out.println("After start: " + t.getState());  // Usually RUNNABLE
        Thread.sleep(100);
        System.out.println("During sleep: " + t.getState()); // Usually TIMED_WAITING
        t.join();
        System.out.println("After completion: " + t.getState()); // TERMINATED
        System.out.println("BLOCKED occurs when waiting to enter a synchronized block.");
    }
}
