package maths;

import java.util.Scanner;

public class PrintASCIICharacterValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Character: ");
        char ch = sc.next().charAt(0);

        int result = (int)ch;

        System.out.println(result);
    }
}
