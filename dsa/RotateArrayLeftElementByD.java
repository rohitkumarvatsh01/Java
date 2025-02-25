/*
Input = [1,2,3,4,5] d=2
Output = 3,4,5,1,2
Approach: [1,2,3,4,5] -> [2,1,5,4,3] -> [3,4,5,1,2]
        : Rotate the array 0 to d, Rotate the array d to arr length and Rotate the array 0 to arr length.
 */
package dsa;

import java.util.Scanner;

public class RotateArrayLeftElementByD {

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateArray(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
        printArray(arr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of Array: ");
        int n = scanner.nextInt();

        System.out.println("Enter the Element of Array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of D: ");
        int d = scanner.nextInt();

        rotateArray(arr, d);
    }
}