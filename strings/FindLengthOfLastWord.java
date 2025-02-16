package strings;

public class FindLengthOfLastWord {

    public static int findLengthOfLastWord1(String str) {
        int length = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                length++;
            } else {
                if (length > 0) {
                    return length;
                }
            }
        }
        return length;
    }

    public static void main(String[] args) {
        String str = StringInput.inputOfString();

        System.out.println(findLengthOfLastWord1(str));
    }
}
