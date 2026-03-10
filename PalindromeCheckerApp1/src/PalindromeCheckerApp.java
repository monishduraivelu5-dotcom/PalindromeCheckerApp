/**
 * MAIN CLASS: UseCase11PalindromeCheckerApp
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This class demonstrates palindrome checking using
 * an object-oriented approach with a separate service class.
 *
 * @author Developer
 * @version 1.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for CLI
     */
    public static void main(String[] args) {

        String input = "madam";

        PalindromeService service = new PalindromeService();

        boolean result = service.checkPalindrome(input);

        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }
    }
}


/**
 * Service class responsible for palindrome logic
 */
class PalindromeService {

    /**
     * Checks whether the given string is a palindrome
     *
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        // Compare characters from both ends
        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}