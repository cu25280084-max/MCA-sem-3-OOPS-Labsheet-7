class SharedCounter {
    private int count = 0;

    synchronized void increment() {
        count++;
    }

    int getCount() {
        return count;
    }
}

public class Q9_SynchronizedCounter {
    public static void main(String[] args) throws InterruptedException {
        SharedCounter counter = new SharedCounter();
        Runnable task = () -> {
            for (int i = 0; i < 100000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count = " + counter.getCount());
    }
}
