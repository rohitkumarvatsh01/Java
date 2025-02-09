package arrays;

import java.util.Arrays;

public class ArrayToStringOrAsList {
    public static void main(String[] args) {
        String[] arr = {"Rohit", "Rahul", "Rohan"};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.asList(arr));

        int[][] brr = {{100, 200}, {300, 400}};
        System.out.println(Arrays.deepToString(brr));
    }
}
