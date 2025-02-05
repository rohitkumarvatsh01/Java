package maths;

import java.util.Scanner;

public class NNaturaNumber {

    public static void nNaturalNumber(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        nNaturalNumber(num);
    }
}
