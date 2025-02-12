package arrays;

import java.util.Arrays;

public class PrefixSumOfArray {

    public static void prefixSumMethod1(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            arr[i] = sum;
        }
    }

    public static int[] prefixSumMethod2(int[] arr) {
        int n = arr.length;
        int[] prefixSumArray = new int[n];
        prefixSumArray[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSumArray[i] = prefixSumArray[i - 1] + arr[i];
        }
        return prefixSumArray;
    }

    public static int[] prefixSumMethod3(int[] arr) {
        int n = arr.length;
        int[] prefixSumArray = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            prefixSumArray[i] = sum;
        }
        return prefixSumArray;
    }

    public static void main(String[] args) {
        int[] arr = ArrayInput.inputOfArray();
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, arr.length);

        System.out.println("Prefix Sum Method 1:");
        prefixSumMethod1(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("\nPrefix Sum Method 2:");
        System.out.println(Arrays.toString(prefixSumMethod2(arr2)));

        System.out.println("\nPrefix Sum Method 3:");
        System.out.println(Arrays.toString(prefixSumMethod3(arr3)));
    }
}
