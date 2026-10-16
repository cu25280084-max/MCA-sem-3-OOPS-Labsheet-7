class SleepingTask extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Sleeping thread starts");
            Thread.sleep(2000);
            System.out.println("Sleeping thread resumes");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class ActiveTask extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Active thread: " + i);
        }
    }
}

public class Q6_SleepDemo {
    public static void main(String[] args) {
        new SleepingTask().start();
        new ActiveTask().start();
    }
}
