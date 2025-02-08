package maths;

import java.util.Scanner;

public class SwapTwoNumber {

    public static void swapTwoNumber1(int num1, int num2) {
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping using third variable Number1: " + num1 + " Number2: " + num2);
    }

    public static void swapTwoNumber2(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping using without third variable Number1: " + num1 + " Number2: " + num2);
    }

    public static void swapTwoNumber3(int num1, int num2) {
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("After swapping using XOR operator Number1: " + num1 + " Number2: " + num2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number1: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the Number2: ");
        int number2 = scanner.nextInt();

        System.out.println("Before swapping Number1: " + number1 + " Number2: " + number2);
        swapTwoNumber1(number1, number2);
        swapTwoNumber2(number1, number2);
        swapTwoNumber3(number1, number2);
    }
}
