package maths;

import java.util.Scanner;

public class CalculatePowerOfN {

    public static int calculatePowerOfN(int n, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= n;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        System.out.println("Enter the Power: ");
        int power = sc.nextInt();

        System.out.println(calculatePowerOfN(num, power));
    }
}
