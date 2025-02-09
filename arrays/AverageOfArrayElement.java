package arrays;

import java.util.Scanner;

public class AverageOfArrayElement {

    public static int averageOfArrayElement(int[] arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum / arr.length;
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

        System.out.println("Average of Array Element: " + averageOfArrayElement(arr));
    }
}
