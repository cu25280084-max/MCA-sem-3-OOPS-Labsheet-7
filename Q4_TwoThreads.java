class NamedTask extends Thread {
    NamedTask(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " prints " + i);
        }
    }
}

public class Q4_TwoThreads {
    public static void main(String[] args) {
        new NamedTask("Thread-A").start();
        new NamedTask("Thread-B").start();
    }
}
