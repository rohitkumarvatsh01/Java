package arrays;

import java.util.Scanner;

public class FindLastOccurrenceOfParticularElementInArray {

    public static Integer findLastOccurrenceOfParticularElementInArray(int[] arr, int key) {
        int lastIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                lastIndex = i;
            }
        }
        return lastIndex;
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

        System.out.println("Enter the Key Element of Array: ");
        int key = scanner.nextInt();

        System.out.println("Last Occurrence of Key Element of Array Index: " + findLastOccurrenceOfParticularElementInArray(arr, key));
    }
}
