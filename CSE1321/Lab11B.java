import java.util.Scanner;

public class Lab11B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.next();
        boolean hasLength = false, hasUpperCase = false, hasDigit = false;
        if (password.length() >= 8) {
            hasLength = true;
        }
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }
        if (hasLength && hasUpperCase && hasDigit) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
        System.out.println("Program Ends");
        scanner.close();
    }
}