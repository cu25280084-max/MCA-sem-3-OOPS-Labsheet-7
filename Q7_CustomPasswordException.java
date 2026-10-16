import java.util.Scanner;

class InvalidPasswordException extends Exception {
    InvalidPasswordException(String message) {
        super(message);
    }
}

public class Q7_CustomPasswordException {
    static void checkPassword(String password) throws InvalidPasswordException {
        if (password.length() < 6) {
            throw new InvalidPasswordException("Password must contain at least 6 characters.");
        }
        System.out.println("Password accepted.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter password: ");
            checkPassword(sc.nextLine());
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
