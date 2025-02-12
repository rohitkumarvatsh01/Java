package arrays;

public class PrintEvenElementFirstThanOddElementInArray {

    public static void printEvenElementFirstThanOddElementInArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                SwapArray.swapArray(arr, left, right);
                left++;
                right--;
            } else if (arr[left] % 2 == 0) {
                left++;
            } else {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = ArrayInput.inputOfArray();
        printEvenElementFirstThanOddElementInArray(arr);
        PrintArray.printArray(arr);
    }
}
