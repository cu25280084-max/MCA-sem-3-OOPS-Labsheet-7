class MessageThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread message " + i);
        }
    }
}

public class Q1_ExtendThread {
    public static void main(String[] args) {
        new MessageThread().start();
    }
}
