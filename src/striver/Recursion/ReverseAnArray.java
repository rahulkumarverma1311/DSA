package striver.Recursion;

import java.util.Arrays;
import java.util.List;

public class ReverseAnArray {
    private static void reverseArray(int i,int arr[],int n){
        if(i >= n/2){
            return;
        }
        swap(arr,i,n-i-1);
        reverseArray(i+1,arr,n);
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverseArray(0,arr, arr.length);
        for(int n : arr){
            System.out.print(n +" ");
        }




    }
}
