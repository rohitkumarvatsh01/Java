package strings;

public class StringPresentOrNot {

    public static boolean stringPresentOrNot(String s1, String s2) {
        if (s1.contains(s2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String string1 = StringInput.inputOfString();
        String string2 = StringInput.inputOfString();

        System.out.println(stringPresentOrNot(string1, string2));
    }
}
