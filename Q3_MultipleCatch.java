import java.util.Scanner;

public class Q3_MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first integer: ");
            int a = Integer.parseInt(sc.nextLine());
            System.out.print("Enter second integer: ");
            int b = Integer.parseInt(sc.nextLine());
            System.out.println("Result = " + (a / b));
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            sc.close();
        }
    }
}
