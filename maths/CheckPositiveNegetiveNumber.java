package maths;

import java.util.Scanner;

public class CheckPositiveNegetiveNumber {

    public static String checkPositiveNegetiveNumber(int num) {
        String result = null;

        if (num >= 1) {
            result = num + " is Positive Number";
        } else if (num < 0) {
            result = num + " is Negative Number";
        } else {
            result = num + " is Zero Number";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int number = scanner.nextInt();

        System.out.println(checkPositiveNegetiveNumber(number));
    }
}
