package strings;

public class RemoveAllWhiteSpaceFromString {

    public static String removeAllWhiteSpaceFromString(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String string = StringInput.inputOfString();

        System.out.println(removeAllWhiteSpaceFromString(string));
    }
}
