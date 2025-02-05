package maths;

import java.util.Scanner;

public class OddEvenNumber {

    public static void oddEvenNumber(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even Number.");
        } else if (num % 2 == 1) {
            System.out.println(num + " is Odd Number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        oddEvenNumber(num);
    }
}
