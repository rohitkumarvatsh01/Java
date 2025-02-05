package maths;

import java.util.Scanner;

public class PrintAllOddEvenNumberN {

    public static void printAllOddEvenNumberN(int num) {
        if (num % 2 == 0) {
            for (int i = 2; i <= num; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        printAllOddEvenNumberN(num);
    }
}
