package strings;

import java.util.Scanner;

public class StringInput {
    public static String inputOfString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String string = scanner.nextLine();

        return string;
    }
}
