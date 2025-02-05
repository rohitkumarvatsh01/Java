package maths;

import java.util.Scanner;

public class SumAllOddEvenNumberN {

    public static int sumAllOddEvenNumberN(int num) {
        int sum = 0;

        if (num % 2 == 0) {
            for (int i = 2; i <= num; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
        } else {
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 1) {
                    sum += i;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        System.out.println(sumAllOddEvenNumberN(num));
    }
}
