package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountPairSumOfArrayUsingMap {

    public static int countPair(int[] arr, int k) {
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int sum = k - arr[i];
            if (map.containsKey(sum)) {
                count += map.get(sum);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = ArrayInput.inputOfArray();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value of Sum: ");
        int k = scanner.nextInt();

        System.out.println(countPair(arr, k));
    }
}
