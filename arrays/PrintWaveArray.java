package arrays;

public class PrintWaveArray {

    public static void waveArray(int[] arr){
        for(int i=0; i<arr.length-1; i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        PrintArray.printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr=ArrayInput.inputOfArray();
        waveArray(arr);
    }
}
