package strings;

public class ConvertStringIntoCharacter {

    public static void stringIntoCharacter1(String string) {
        char[] charArray = new char[string.length()];

        for (int i = 0; i < string.length(); i++) {
            charArray[i] = string.charAt(i);
        }

        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }
    }

    public static void stringIntoCharacter2(String string) {
        char[] charArray = string.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }
    }

    public static void main(String[] args) {
        String string = StringInput.inputOfString();

        stringIntoCharacter1(string);
        System.out.println();
        stringIntoCharacter2(string);
    }
}