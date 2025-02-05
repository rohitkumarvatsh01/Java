package maths;

import java.util.Scanner;

public class GreaterNumberInTwoNumber {

    public static void greaterNumberInTwoNumber(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("Number1: " + num1 + " is a Greater.");
        } else if (num1 < num2) {
            System.out.println("Number2: " + num2 + " is a Greater.");
        } else {
            System.out.println("Number1: " + num1 + " and Number2: " + num2 + " is a Equal.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the Number2: ");
        int num2 = sc.nextInt();

        greaterNumberInTwoNumber(num1, num2);
    }
}
