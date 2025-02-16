package strings;

public class StringPresentOrNot {

    public static boolean stringPresentOrNot(String s1, String s2) {
        return s1.contains(s2);
    }

    public static void main(String[] args) {
        String string1 = StringInput.inputOfString();
        String string2 = StringInput.inputOfString();

        System.out.println(stringPresentOrNot(string1, string2));
    }
}
