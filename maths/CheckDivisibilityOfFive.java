package maths;

import java.util.Scanner;

public class CheckDivisibilityOfFive {

    public static boolean checkDivisibilityOfFive(int num) {
        return num % 5 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int number = scanner.nextInt();

        System.out.println("Number " + number + " is Divisibility of 5: " + checkDivisibilityOfFive(number));
    }
}
