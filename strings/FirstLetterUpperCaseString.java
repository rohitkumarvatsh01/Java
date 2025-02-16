package strings;

public class FirstLetterUpperCaseString {

    public static char[] firstLetterUpperCaseString(String s) {
        char[] charArray = s.toCharArray();
        charArray[0] = Character.toUpperCase(charArray[0]);

        for (int i = 1; i < charArray.length-1; i++) {
            if (charArray[i] == ' ') {
                charArray[i+1] = Character.toUpperCase(charArray[i+1]);
            }
        }
        return charArray;
    }

    public static void main(String[] args) {
        String s = StringInput.inputOfString();

        System.out.println(firstLetterUpperCaseString(s));
    }
}
