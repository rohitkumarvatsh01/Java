package dsa;

import java.util.Scanner;

public class MaxSumOfSubArrayKSize {

    public static int maxSumOfSubArray(int[] arr, int w) {
        int current = 0;
        for (int i = 0; i < w; i++) {
            current += arr[i];
        }

        int max = current;
        for (int i = 1; i <= arr.length - w; i++) {
            current -= arr[i - 1];
            current += arr[i + w - 1];
            max = Math.max(current, max);
        }

        return max;
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

        System.out.println("Enter the size of w: ");
        int w = scanner.nextInt();

        System.out.println("Max Sum of SubArray:- " + maxSumOfSubArray(arr, w));
    }
}
