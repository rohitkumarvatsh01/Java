package arrays;

import java.util.Arrays;

public class PrintSquareOfSortedArrayElement {

    public static int[] squareOfSortedArrayElement(int[] arr) {
        int n = arr.length;
        int[] ans = new int[arr.length];
        int k = 0;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[right];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        Arrays.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = ArrayInput.inputOfArray();

        PrintArray.printArray(squareOfSortedArrayElement(arr));
    }
}
