package arrays;

import java.util.HashSet;
import java.util.Set;

public class FindMissingElementInArray {
    public static int missingElementArray1(int[] arr) {
        int n = arr.length + 1;
        int totalSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        return totalSum - actualSum;
    }

    public static int missingElementArray2(int[] arr) {
        Set<Integer> set=new HashSet<>();
        int n=arr.length+1;

        for(int num:arr){
            if(num>0)
                set.add(num);
        }

        for (int i=1; i<=n; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = ArrayInput.inputOfArray();
        System.out.println("Missing Element in Array1: " + missingElementArray1(arr));
        System.out.println("Missing Element in Array2: " + missingElementArray2(arr));
    }
}
