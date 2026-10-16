class FirstTask extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("First thread: " + i);
        }
    }
}

public class Q7_JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        FirstTask first = new FirstTask();
        first.start();
        first.join();
        System.out.println("Second task starts after first finishes.");
    }
}
