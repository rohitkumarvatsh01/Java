package maths;

import java.util.Scanner;

public class GreaterNumberInThreeNumber {

    public static int greaterNumberInThreeNumber(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the Number2: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the Number3: ");
        int num3 = sc.nextInt();

        System.out.println(greaterNumberInThreeNumber(num1, num2, num3));
    }
}
