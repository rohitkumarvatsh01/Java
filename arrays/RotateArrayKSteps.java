package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayKSteps {

    public static int[] rotateArrayKSteps(int[] arr, int k) {
        int[] ans = new int[arr.length];
        int j = 0;
        int n = arr.length;

        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
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

        System.out.println("Enter the Size of K: ");
        int K = scanner.nextInt();

        System.out.println(Arrays.toString(rotateArrayKSteps(arr, K)));
    }
}
