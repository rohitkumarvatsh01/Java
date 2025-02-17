package strings;

public class SumNumberOfStrings {

    public static int sumNumberOfStrings(String str) {
        int sum = 0;
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum = (sum * 10) + str.charAt(i) - '0';
            } else {
                result += sum;
                sum = 0;
            }
        }
        result += sum;
        return result;
    }

    public static void main(String[] args) {
        String string = StringInput.inputOfString();

        System.out.println(sumNumberOfStrings(string));
    }
}
