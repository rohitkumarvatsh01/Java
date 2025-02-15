package strings;

import java.util.Scanner;

public class CheckOccurancePresentOrNot {

    public static int checkOccurancePresentOrNot(String string, char ch) {
        return string.indexOf(ch);
    }

    public static void main(String[] args) {
        String string = StringInput.inputOfString();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Character: ");
        char ch = scanner.next().charAt(0);

        System.out.println(checkOccurancePresentOrNot(string, ch));
    }
}
