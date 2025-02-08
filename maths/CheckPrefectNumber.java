package maths;

import java.util.Scanner;

public class CheckPrefectNumber {

    public static boolean checkPrefectNumber(int num) {
        int sum = 0;
        int store = num;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == store;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int number = scanner.nextInt();

        System.out.println("Check the Prefect Number: " + checkPrefectNumber(number));
    }
}
