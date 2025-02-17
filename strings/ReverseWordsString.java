package strings;

public class ReverseWordsString {
    public static String reverseWordsString(String string) {
        String[] arr = string.split(" ");
        String reverse = "";

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            for (int j = word.length() - 1; j >= 0; j--) {
                reverse += word.charAt(j);
            }
            if (i < arr.length - 1) {
                reverse += " ";
            }
        }
        return reverse;
    }

    public static void main(String[] args) {
        String s = StringInput.inputOfString();
        System.out.println(reverseWordsString(s));
    }
}