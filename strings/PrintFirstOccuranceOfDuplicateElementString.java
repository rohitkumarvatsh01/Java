package strings;

import java.util.HashSet;
import java.util.Set;

public class PrintFirstOccuranceOfDuplicateElementString {

    public static String printFirstOccuranceOfDuplicateElementString1(String str) {
        char[] ch = str.toCharArray();
        String ans = "";

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '*') {
                for (int j = i + 1; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        ch[j] = '*';
                        break;
                    }
                }
                ans += ch[i];
            }
        }
        return ans;
    }


    public static String printFirstOccuranceOfDuplicateElementString2(String str) {
        Set<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        return set.toString();
    }

    public static void main(String[] args) {
        String string = StringInput.inputOfString();
        System.out.println(printFirstOccuranceOfDuplicateElementString1(string));
        System.out.println(printFirstOccuranceOfDuplicateElementString2(string));
    }
}
