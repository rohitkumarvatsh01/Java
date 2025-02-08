package maths;

import java.util.Scanner;

public class AreaOfSquare {

    public static double areaOfSquare(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Side: ");
        int side = scanner.nextInt();

        System.out.println("Area of Rectangle of: " + areaOfSquare(side));
    }
}
