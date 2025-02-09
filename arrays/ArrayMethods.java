package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethods {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
        printArray(arr);
    }

    public static boolean checkEqualsTwoArray(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void copyElementOneArrayToAnotherArray(int[] arr) {
        Arrays.copyOf(arr, arr.length);
        printArray(arr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of Array1: ");
        int size1 = scanner.nextInt();

        System.out.println("Enter the Element of Array1: ");
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Enter the Size of Array2: ");
        int size2 = scanner.nextInt();

        System.out.println("Enter the Element of Array2: ");
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }

        System.out.println("Sorting Array: ");
        sortArray(arr1);

        System.out.println("Check the Array1 and Array2 is Equal or not: " + checkEqualsTwoArray(arr1, arr2));

        System.out.print("Copy Array: ");
        copyElementOneArrayToAnotherArray(arr1);
    }
}
