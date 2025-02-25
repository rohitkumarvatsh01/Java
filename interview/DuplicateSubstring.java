/*Input: s = "abcabcbb"
  Output: 3
  Explanation: The answer is "abc", with the length of 3.
*/

package interview;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateSubstring {

    public static int duplicateSubstring(String str) {
        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int i = 0; i < str.length(); i++) {
            while (set.contains(str.charAt(i))) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(i));
            maxLength = Math.max(maxLength, i - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String string = scanner.nextLine();

        System.out.println(duplicateSubstring(string));
    }
}
