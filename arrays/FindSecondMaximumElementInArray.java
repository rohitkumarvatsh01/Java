package arrays;

import java.util.Scanner;

public class FindSecondMaximumElementInArray {

    public static int findFirstMaximumElementInArray(int[] arr) {
        int n = arr.length;
        int firstMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > firstMax) {
                firstMax = arr[i];
            }
        }
        return firstMax;
    }

    public static int findSecondMaximumElementInArray(int[] arr) {
        int n = arr.length;
        int firstMax = findFirstMaximumElementInArray(arr);

        for (int i = 0; i < n; i++) {
            if (arr[i] == firstMax) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        return findFirstMaximumElementInArray(arr);
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

        System.out.println("First Maximum Element in Array: " + findFirstMaximumElementInArray(arr));
        System.out.println("Second Maximum Element in Array: " + findSecondMaximumElementInArray(arr));
    }
}
