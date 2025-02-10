package arrays;

import java.util.Scanner;

public class CheckTwoArraysIsSorted {

    public static boolean checkTwoArraysIsSorted1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkTwoArraysIsSorted2(int[] arr) {
        boolean check = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;
            }
        }
        return check;
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

        System.out.println(checkTwoArraysIsSorted1(arr));
        System.out.println(checkTwoArraysIsSorted2(arr));
    }
}
