package strings;

public class FindDuplicateCharacterString {

    public static void findDuplicateCharacterString(String string) {
        for (int i = 0; i < string.length() - 1; i++) {
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    System.out.print(string.charAt(i));
                }
            }
        }
    }

    public static void main(String[] args) {
        String string = StringInput.inputOfString();

        findDuplicateCharacterString(string);
    }
}
