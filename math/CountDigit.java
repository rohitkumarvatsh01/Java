package math;

import java.util.Scanner;

public class CountDigit {
    public static int countDigit(int num) {
        int rem;
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        System.out.println(countDigit(num));
    }
}
