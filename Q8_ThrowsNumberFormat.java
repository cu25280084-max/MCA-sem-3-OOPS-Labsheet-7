import java.util.Scanner;

public class Q8_ThrowsNumberFormat {
    static int readNumber(Scanner sc) throws NumberFormatException {
        System.out.print("Enter a number: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Number = " + readNumber(sc));
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer format.");
        } finally {
            sc.close();
        }
    }
}
