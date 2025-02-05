package maths;

import java.util.Scanner;

public class SumDigit {

    public static int sumDigit(int num) {
        int rem;
        int sum = 0;

        while (num > 0) {
            rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        System.out.println(sumDigit(num));
    }
}
