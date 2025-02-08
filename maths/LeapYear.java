package maths;

import java.util.Scanner;

public class LeapYear {

    public static boolean leapYear(int year) {
        return (year % 400 == 0 && year % 100 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = scanner.nextInt();

        System.out.println("Year " + year + " is Leap Year: " + leapYear(year));
    }
}
