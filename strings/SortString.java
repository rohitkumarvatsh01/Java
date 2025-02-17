package strings;

import java.util.Arrays;

public class SortString {

    public static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] args) {
        String str = StringInput.inputOfString();
        System.out.println(sortString(str));
    }
}
