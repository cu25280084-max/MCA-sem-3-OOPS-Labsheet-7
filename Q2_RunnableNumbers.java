class NumberTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

public class Q2_RunnableNumbers {
    public static void main(String[] args) {
        new Thread(new NumberTask()).start();
    }
}
