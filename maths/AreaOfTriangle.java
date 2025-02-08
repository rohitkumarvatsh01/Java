package maths;

import java.util.Scanner;

public class AreaOfTriangle {

    public static double areaOfTriangle(int a, int b, int c) {
        int s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the a: ");
        int a = scanner.nextInt();

        System.out.println("Enter the b: ");
        int b = scanner.nextInt();

        System.out.println("Enter the c: ");
        int c = scanner.nextInt();

        System.out.println("Area of Triangle of: " + areaOfTriangle(a, b, c));
    }
}
