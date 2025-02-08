package maths;

import java.util.Scanner;

public class ArmstrongNumber {

    public static boolean armstrongNumber(int num) {
        int rem;
        int arm = 0;
        int store = num;

        while (num > 0) {
            rem = num % 10;
            arm = (rem * rem * rem) + arm;
            num /= 10;
        }

        if (store == arm){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = scanner.nextInt();

        System.out.println("Number "+ num + "is Armstrong Number: "+ armstrongNumber(num));
    }
}
