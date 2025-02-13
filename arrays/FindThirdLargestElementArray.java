package arrays;

public class FindThirdLargestElementArray {
    public static void findThirdLargestElementArray(int[] arr) {
        if (arr.length < 3) {
            System.out.println("Array should have at least 3 elements.");
            return;
        }

        int firstLarge = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        int thirdLarge = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLarge) {
                thirdLarge = secondLarge;
                secondLarge = firstLarge;
                firstLarge = arr[i];
            } else if (arr[i] > secondLarge && arr[i] < firstLarge) {
                thirdLarge = secondLarge;
                secondLarge = arr[i];
            } else if (arr[i] > thirdLarge && arr[i] < secondLarge) {
                thirdLarge = arr[i];
            }
        }

        System.out.println("First Largest Element: " + firstLarge);
        System.out.println("Second Largest Element: " + secondLarge);
        System.out.println("Third Largest Element: " + thirdLarge);
    }

    public static void main(String[] args) {
        int[] arr = ArrayInput.inputOfArray();
        findThirdLargestElementArray(arr);
    }
}