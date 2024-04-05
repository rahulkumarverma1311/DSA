package arrays;

public class WaveArray {

    private static void convertToWave(int n, int[] a) {
        for(int i=1;i<n;i= i+2){
            int t =a[i];
            a[i] = a[i-1];
            a[i-1] = t;

        }

    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5}; // 2 1 4 3 5

        convertToWave(arr.length, arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }



    }
}
