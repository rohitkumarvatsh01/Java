package strings;

public class PrintAllStrings {

    public static void printAllStrings(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        String string = StringInput.inputOfString();

        printAllStrings(string);
    }
}
