package dsa;

import arrays.ArrayInput;
import arrays.PrintArray;
import maths.NumberInput;

public class RotateArrayLeftElementByD {

    public static void reverseArray(int[] arr, int left, int right) {
        while (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void leftRotateArray(int[] arr, int d) {
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1);

        PrintArray.printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = ArrayInput.inputOfArray();
        int d = NumberInput.inputOfNumber();

        leftRotateArray(arr, d);
    }
}
