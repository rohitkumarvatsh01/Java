package maths;

import java.util.Scanner;

public class AreaOfRectangle {

    public static double areaOfRectangle(int length, int breath) {
        return length * breath;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Length: ");
        int length = scanner.nextInt();

        System.out.println("Enter the Breath: ");
        int breath = scanner.nextInt();

        System.out.println("Area of Rectangle of: " + areaOfRectangle(length, breath));
    }
}
