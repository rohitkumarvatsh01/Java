package arrays;

import java.util.Scanner;

public class SumOfIndexOfLAndR {

    public static int sumOfLAndRIndex(int[] arr, int l, int r) {
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = ArrayInput.inputOfArray();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Value of L: ");
        int l = scanner.nextInt();

        System.out.println("Enter the Value of R: ");
        int R = scanner.nextInt();

        System.out.println(sumOfLAndRIndex(arr, l, R));
    }
}
