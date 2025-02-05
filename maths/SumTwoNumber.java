package maths;

import java.util.Scanner;

public class SumTwoNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the Number2: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum of Number1 and Number2 is: " + sum);
    }
}
