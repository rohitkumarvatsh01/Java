package strings;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterString {

    public static int firstUniqueCharacterString1(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqueCharacterString2(String str) {
        int[] frequency = new int[26];

        for (char ch : str.toCharArray()) {
            frequency[ch - 'a']++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (frequency[str.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String string = StringInput.inputOfString();
        System.out.println(firstUniqueCharacterString1(string));
        System.out.println(firstUniqueCharacterString2(string));
    }
}
