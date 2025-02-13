package maths;

import java.util.Scanner;

public class PalindromeNumber {

    public static boolean palindromeNumber(int num) {
        int rem;
        int reverse = 0;
        int store = num;

        while (num > 0) {
            rem = num % 10;
            reverse = (reverse * 10) + rem;
            num /= 10;
        }

        return reverse == store;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = scanner.nextInt();

        System.out.println("Number " + num + " is Palindrome: " + palindromeNumber(num));
    }
}
