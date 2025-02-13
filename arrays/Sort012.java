package arrays;

public class Sort012 {

    public static void sort012(int[] arr) {
        int start = 0;
        int mid = 0;
        int end = arr.length - 1;

        while (mid <= end) {
            if (arr[mid] == 0) {
                int temp = arr[start];
                arr[start] = arr[mid];
                arr[mid] = temp;
                start++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[end];
                arr[end] = temp;
                end--;
            }
        }
        PrintArray.printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = ArrayInput.inputOfArray();

        sort012(arr);
    }
}
