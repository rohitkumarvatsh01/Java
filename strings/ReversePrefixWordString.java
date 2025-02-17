package strings;

import java.util.Scanner;

public class ReversePrefixWordString {
    public static String reversePrefixWordString(String string, char ch) {
        String ans = "";
        int right = string.indexOf(ch);
        if (right == -1) {
            return string;
        }

        for (int i = right; i >= 0; i--) {
            ans += string.charAt(i);
        }

        for (int i = right + 1; i < string.length(); i++) {
            ans += string.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        String string = StringInput.inputOfString();
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        System.out.println(reversePrefixWordString(string, ch));
    }
}
