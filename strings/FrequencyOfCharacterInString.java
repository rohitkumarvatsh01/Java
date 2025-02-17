package strings;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacterInString {

    public static Map<Character, Integer> frequencyOfCharacterInString(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = str.toCharArray();

        for (char ch : charArray) {
            if (map.containsKey(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String s = StringInput.inputOfString();

        System.out.println(frequencyOfCharacterInString(s));
    }
}
