package strings;

public class ExtractMaximumNumberFromString {
    public static int extractMaximumNumberFromString(String str) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum = sum * 10 + Character.getNumericValue(str.charAt(i));
            } else {
                if (sum > max) {
                    max = sum;
                }
                sum = 0;
            }
        }

        if (sum > max) {
            max = sum;
        }
        return max;
    }

    public static void main(String[] args) {
        String string = StringInput.inputOfString();
        System.out.println(extractMaximumNumberFromString(string));
    }
}
