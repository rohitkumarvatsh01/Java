package maths;

import java.util.Scanner;

public class FindSquareRoot {

    public static double findSquareRoot(int num) {
        return Math.sqrt(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        System.out.println(findSquareRoot(num));
    }
}
