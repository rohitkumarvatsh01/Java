package arrays;

import java.util.Scanner;

public class WayToPrintArray {

    public static void forLoop(int[] arr, int n) {
        System.out.println("Printing array using for loop: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void forEachLoop(int[] arr, int n) {
        System.out.println("Printing array using for each loop: ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of Array: ");
        int size = scanner.nextInt();

        System.out.println("Enter the Element of Array: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        forLoop(arr, size);
        forEachLoop(arr, size);
    }
}
