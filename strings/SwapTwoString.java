package strings;

public class SwapTwoString {
    public static void main(String[] args) {
        String str1 = StringInput.inputOfString();
        String str2 = StringInput.inputOfString();

        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("String s1: " + str1);
        System.out.println("String s2: " + str2);
    }
}
