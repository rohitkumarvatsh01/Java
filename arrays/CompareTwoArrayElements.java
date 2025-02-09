package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareTwoArrayElements {

    public static boolean equalOperator(int[] arr1, int[] arr2) {
        return arr1 == arr2;
    }

    public static boolean equalsMethod(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr1);
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

        System.out.println(equalOperator(arr1, arr2));
        System.out.println(equalsMethod(arr1, arr2));
    }
}
