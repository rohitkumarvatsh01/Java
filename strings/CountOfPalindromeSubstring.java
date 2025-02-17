package strings;

public class CountOfPalindromeSubstring {

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static int countOfPalindromeSubstring(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String subString = str.substring(i, j);
                if (isPalindrome(subString)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = StringInput.inputOfString();

        System.out.println(countOfPalindromeSubstring(str));
    }
}
