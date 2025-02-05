package maths;

import java.util.Scanner;

public class VowelConsonant {

    public static void vowelConsonant(char ch) {
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a Vowel.");
        } else {
            System.out.println(ch + " is a Consonant.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Character: ");
        char ch = sc.next().charAt(0);

        vowelConsonant(ch);
    }
}
