package strings;

import java.util.Arrays;

public class CheckStringAnagram {

    public static boolean checkStringAnagram(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        if (ch1.length != ch2.length) {
            return false;
        }

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String string1 = StringInput.inputOfString();
        String string2 = StringInput.inputOfString();

        System.out.println("String1 and String is Anagram or Not: " + checkStringAnagram(string1, string2));
    }
}
