public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("     PALINDROME CHECKER SYSTEM");
        System.out.println("====================================");
        System.out.println("Version: 2.0");
        System.out.println("Use Case 2: Hardcoded Palindrome Check");
        System.out.println();

        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println("The word '" + word + "' is a PALINDROME.");
        } else {
            System.out.println("The word '" + word + "' is NOT a palindrome.");
        }

        System.out.println();
        System.out.println("Program finished.");
    }
}