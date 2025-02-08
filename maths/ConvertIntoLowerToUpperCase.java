package maths;

import java.util.Scanner;

public class ConvertIntoLowerToUpperCase {

    public static char convertIntoLowerToUpperCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return Character.toLowerCase(ch);
        } else {
            return Character.toUpperCase(ch);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Character: ");
        char ch = scanner.next().charAt(0);

        System.out.println(convertIntoLowerToUpperCase(ch));
    }
}
