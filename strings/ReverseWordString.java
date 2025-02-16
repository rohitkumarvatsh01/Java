package strings;

public class ReverseWordString {

    public static String reverseString(String str) {
        String reverse = "";
        String[] arr = str.split("");

        for (int i = arr.length - 1; i >= 0; i--) {
            reverse += arr[i];
        }
        return reverse;
    }

    public static void main(String[] args) {
        String str = StringInput.inputOfString();

        System.out.println(reverseString(str));
    }
}
