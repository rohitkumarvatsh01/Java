package maths;

import java.util.Scanner;

public class TribonacciSeries {

    public static void tribonacciSeries(int num) {
        int a = 0;
        int b = 1;
        int c = 2;
        int d;

        for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        tribonacciSeries(num);
    }
}
