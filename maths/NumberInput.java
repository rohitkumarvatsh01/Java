package maths;

import java.util.Scanner;

public class NumberInput {
    public static int inputOfNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");

        return scanner.nextInt();
    }

}
