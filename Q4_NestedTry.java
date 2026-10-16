public class Q4_NestedTry {
    public static void main(String[] args) {
        int[] values = {10, 20, 30};
        int a = 20, b = 2;
        try {
            System.out.println("Division = " + (a / b));
            try {
                System.out.println("Array value = " + values[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: invalid array index.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: cannot divide by zero.");
        }
    }
}
