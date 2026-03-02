import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("     PALINDROME CHECKER SYSTEM");
        System.out.println("====================================");
        System.out.println("Version: 3.0");
        System.out.println("Use Case 3: User Input Palindrome Check");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to check: ");
        String word = scanner.nextLine();

        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Check palindrome
        if (word.equals(reversed)) {
            System.out.println("The word '" + word + "' is a PALINDROME.");
        } else {
            System.out.println("The word '" + word + "' is NOT a palindrome.");
        }

        System.out.println();
        System.out.println("Program finished.");

        scanner.close();
    }
}