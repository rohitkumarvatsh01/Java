package maths;

import java.util.Scanner;

public class PrimeNumber {

    public static void primeNumber(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.print(num + " is a prime number.");
        } else {
            System.out.print(num + " is not a prime number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        primeNumber(num);
    }
}
