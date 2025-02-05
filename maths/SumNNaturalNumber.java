package maths;

import java.util.Scanner;

public class SumNNaturalNumber {

    public static void sumNNaturalNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        sumNNaturalNumber(num);
    }
}
