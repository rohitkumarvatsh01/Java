package maths;

import java.util.Scanner;

public class ReplaceZeroWithFive {

    public static int replaceZeroWithFive(int num) {
        int rem;
        int reverse = 0;

        while (num > 0) {
            rem = num % 10;
            if (rem == 0) {
                reverse = (reverse * 10) + 5;
            } else {
                reverse = (reverse * 10) + rem;
            }
            num /= 10;
        }

        int ans = 0;
        int rem1;
        while (reverse > 0) {
            rem1 = reverse % 10;
            ans = (ans * 10) + rem1;
            reverse /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int number = scanner.nextInt();

        System.out.println(replaceZeroWithFive(number));
    }
}
