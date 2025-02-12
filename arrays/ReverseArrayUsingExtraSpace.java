package arrays;

import java.util.Scanner;

import static arrays.PrintArray.printArray;

public class ReverseArrayUsingExtraSpace {

    public static int[] reverseArray(int[] arr) {
        int[] reverse = new int[arr.length];

        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse[j++] = arr[i];
        }
        return reverse;
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

        printArray(reverseArray(arr));
    }
}
