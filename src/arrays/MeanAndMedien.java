package arrays;

import java.util.Arrays;

public class MeanAndMedien {

    private static int median(int A[],int N) {

        Arrays.sort(A);
        if (N % 2 != 0)
            return A[N / 2];
        else {
            return (A[N / 2] + A[N / 2 - 1]) / 2;
        }
    }

    private static int mean(int A[],int N)
    {
        //Your code here
        int sum = 0;

        for(int i=0;i<N;i++){
            sum+= A[i];
        }
        return (int) (sum/ N);
    }

    public static void main(String[] args) {
        int arr[] = {2, 8, 3, 4};
        int n = arr.length;
        System.out.println("mean:-"+ mean(arr,n));
        System.out.println("medien:-"+ median(arr,n));
    }

}
