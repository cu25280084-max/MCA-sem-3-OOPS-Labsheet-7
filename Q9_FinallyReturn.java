public class Q9_FinallyReturn {
    static int getValue() {
        try {
            return 10;
        } finally {
            System.out.println("Finally block executes before the method returns.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Returned value = " + getValue());
    }
}
