package maths;

import java.util.Scanner;

public class FindNPRNumber {

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int findNPRNumber(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the N: ");
        int n = scanner.nextInt();

        System.out.println("Enter the R: ");
        int r = scanner.nextInt();

        System.out.println(findNPRNumber(n, r));
    }
}
