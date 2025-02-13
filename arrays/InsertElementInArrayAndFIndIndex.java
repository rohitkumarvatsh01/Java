package arrays;

import java.util.Scanner;

public class InsertElementInArrayAndFIndIndex {

    public static int insertElementInArray(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = ArrayInput.inputOfArray();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Target Element: ");
        int target = scanner.nextInt();

        System.out.println(insertElementInArray(arr, target));
    }
}
