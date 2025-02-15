package strings;

import java.util.Scanner;

public class CheckStringPresentOrNot {

    public static boolean checkStringPresentOrNot(String mainString, String checkString) {
        return mainString.contains(checkString);
    }

    public static void main(String[] args) {
        String string = StringInput.inputOfString();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String which want to check");
        String checkString = scanner.nextLine();

        System.out.println(checkStringPresentOrNot("String Present or Not: " + string, checkString));
    }
}
