class PriorityTask extends Thread {
    PriorityTask(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " running; priority = " + getPriority());
    }
}

public class Q5_ThreadPriority {
    public static void main(String[] args) {
        PriorityTask low = new PriorityTask("Low");
        PriorityTask normal = new PriorityTask("Normal");
        PriorityTask high = new PriorityTask("High");

        low.setPriority(Thread.MIN_PRIORITY);
        normal.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);

        low.start();
        normal.start();
        high.start();
        System.out.println("Priority does not guarantee execution order.");
    }
}
