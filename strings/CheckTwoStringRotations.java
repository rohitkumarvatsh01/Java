package strings;

public class CheckTwoStringRotations {

    public static boolean checkTwoStringRotations(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String s3 = s1 + s1;
        return s3.contains(s2);
    }

    public static void main(String[] args) {
        String string1 = StringInput.inputOfString();
        String string2 = StringInput.inputOfString();

        System.out.println(checkTwoStringRotations(string1, string2));
    }
}
