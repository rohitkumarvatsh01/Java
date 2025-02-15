package strings;

public class CheckPalindromeString {

    public static boolean checkPalindromeString(String string) {
        String reverseSting = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            reverseSting += string.charAt(i);
        }

        return string.equals(reverseSting);
    }

    public static void main(String[] args) {
        String string = StringInput.inputOfString();

        System.out.println("String Palindrome or Not: " + checkPalindromeString(string));
    }
}
