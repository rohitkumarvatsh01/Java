package arrays;

import java.util.Scanner;

import static arrays.PrintArray.printArray;

public class ReverseInGroupArray {

    public static void reverseInGroupArray(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < n; i += k) {
            int start = i;
            int end = Math.min(i + k - 1, n - 1);

            while (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
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

        System.out.println("Enter the K: ");
        int k = scanner.nextInt();

        reverseInGroupArray(arr, k);
        printArray(arr);
    }
}
