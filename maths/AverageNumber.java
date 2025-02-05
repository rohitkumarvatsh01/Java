package maths;

import java.util.Scanner;

public class AverageNumber {

    public static int averageNumber(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the Number2: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the Number3: ");
        int num3 = sc.nextInt();

        System.out.println(averageNumber(num1, num2, num3));
    }
}
