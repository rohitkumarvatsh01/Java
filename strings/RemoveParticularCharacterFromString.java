package strings;

import java.util.Scanner;

public class RemoveParticularCharacterFromString {

    public static String removeParticularCharacterFromString(String string, char ch) {
        String result = "";

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ch) {
                result += string.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String string = StringInput.inputOfString();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Character: ");
        char ch = scanner.next().charAt(0);

        System.out.println(removeParticularCharacterFromString(string, ch));
    }
}
