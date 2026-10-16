class SharedCounter {
    int count = 0;

    void increment() {
        count++;
    }
}

public class Q8_UnsynchronizedCounter {
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

        System.out.println("Expected: 200000");
        System.out.println("Actual: " + counter.count);
        System.out.println("The result may be incorrect because increments are not synchronized.");
    }
}
