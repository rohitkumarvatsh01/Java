/*
Input = [1,2,3,4,5] d=2
Output = 3,4,5,1,2
Approach: [1,2,3,4,5] -> [2,1,5,4,3] -> [3,4,5,2,1]
        : Rotate the array 0 to d, Rotate the array d to arr length and Rotate the array 0 to arr length.
 */

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
