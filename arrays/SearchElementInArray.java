package arrays;

import java.util.Scanner;

public class SearchElementInArray {

    public static boolean searchElementInArray(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
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

        System.out.println("Enter the Search Element in Array: ");
        int key = scanner.nextInt();

        System.out.println("Element " + key + " is Found in Array: " + searchElementInArray(arr, key));
    }
}
