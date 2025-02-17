package strings;

public class CountDuplicateCharacterReplaceWithDigit {

    public static String countDuplicateCharacterReplaceWithDigit(String string) {
        String ans = "" + string.charAt(0);
        int count = 1;

        for (int i = 1; i < string.length(); i++) {
            char curr = string.charAt(i);
            char prev = string.charAt(i - 1);

            if (curr == prev) {
                count++;
            } else {
                if (count > 1) {
                    ans += count;
                    count = 1;
                    ans += curr;
                }
            }
        }

        if (count > 1) {
            ans += count;
        }
        return ans;
    }

    public static void main(String[] args) {
        String string = StringInput.inputOfString();

        System.out.println(countDuplicateCharacterReplaceWithDigit(string));
    }
}
