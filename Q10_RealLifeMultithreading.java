class PrintTask extends Thread {
    PrintTask(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int page = 1; page <= 3; page++) {
            System.out.println(getName() + " printing page " + page);
        }
    }
}

class DataTask extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Data processor handled batch " + i);
        }
    }
}

public class Q10_RealLifeMultithreading {
    public static void main(String[] args) {
        new PrintTask("Document Printer").start();
        new DataTask().start();
    }
}
