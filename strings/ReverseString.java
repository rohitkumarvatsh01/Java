package strings;

public class ReverseString {

    public static String ownMethod(String string) {
        String reverseString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString += string.charAt(i);
        }
        return reverseString;
    }

    public static void stringBuffer(String string) {
        StringBuffer stringBuffer = new StringBuffer(string);
        System.out.println(stringBuffer.reverse());
    }

    public static void stringBuilder(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        System.out.println(stringBuilder.reverse());
    }

    public static void main(String[] args) {
        String string = StringInput.inputOfString();

        System.out.println(ownMethod(string));
        stringBuffer(string);
        stringBuilder(string);
    }
}
