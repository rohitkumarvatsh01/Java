package arrays;

import java.util.Scanner;

public class SmallestAndBiggestElementInArray {

    public static Integer smallestElementInArray(int[] arr) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static Integer biggestElementInArray(int[] arr) {
        int biggest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > biggest) {
                biggest = arr[i];
            }
        }
        return biggest;
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

        System.out.println("Smallest Element in Array: " + smallestElementInArray(arr));
        System.out.println("Biggest Element in Array: " + biggestElementInArray(arr));
    }
}
