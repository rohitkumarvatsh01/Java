package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintSmallestAndLargestElementInArray {

    public static int[] printSmallestAndLargestElementInArray(int[] arr) {
        Arrays.sort(arr);
        return new int[]{arr[0], arr[arr.length - 1]};
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

        System.out.println(Arrays.toString(printSmallestAndLargestElementInArray(arr)));
    }
}
