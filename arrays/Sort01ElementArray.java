package arrays;

import static arrays.ArrayInput.inputOfArray;
import static arrays.PrintArray.printArray;
import static arrays.SwapArray.swapArray;

public class Sort01ElementArray {

    public static void sort01Method1(int[] arr) {
        int countZero = 0;

        for (int j : arr) {
            if (j == 0) {
                countZero++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < countZero) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    public static void sort01Method2(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swapArray(arr, left, right);
                left++;
                right--;
            } else if (arr[left] == 0) {
                left++;
            } else if (arr[right] == 1) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = inputOfArray();

        System.out.println("Sort Array in 0 and 1 Using Normal Approach: ");
        sort01Method1(arr);
        printArray(arr);

        System.out.println();

        System.out.println("Sort Array in 0 and 1 Using Two Pointer Approach: ");
        sort01Method2(arr);
        printArray(arr);
    }
}
