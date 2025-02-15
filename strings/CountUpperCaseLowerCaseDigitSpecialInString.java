package strings;

public class CountUpperCaseLowerCaseDigitSpecialInString {

    public static void countUpperCaseLowerCaseDigitSpecialInString(String string) {
        int lowerCount = 0;
        int upperCount = 0;
        int digitCount = 0;
        int specialCount = 0;

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upperCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                lowerCount++;
            } else if (ch >= '0' && ch <= '9') {
                digitCount++;
            } else {
                specialCount++;
            }
        }

        System.out.println("Lower Case Count: " + lowerCount);
        System.out.println("Upper Case Count: " + upperCount);
        System.out.println("Digit Count: " + digitCount);
        System.out.println("Special Count: " + specialCount);
    }

    public static void main(String[] args) {
        String string = StringInput.inputOfString();

        countUpperCaseLowerCaseDigitSpecialInString(string);
    }
}
