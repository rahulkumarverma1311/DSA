package arrays;

import java.util.List;

public class NextPermutation {


    private static int[] nextPermutationCode(int arr[]){
        int ind =  -1;
        int n = arr.length;
        for(int i = n-2;i>=0;i--){
            if(arr[i] < arr[i + 1]){
                ind=i;
                break;
            }
        }
        if(ind ==-1){
            reverse(arr,0, arr.length);
            return arr;
        }
        for(int i=n-1;i>ind;i--){
                if(arr[i] > arr[ind]){
                    swap(arr,i,ind);
                    break;
                }
        }
        reverse(arr,ind+1, arr.length-1);
        return arr;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }





    public static void main(String[] args) {


//        int arr[] = {2,1,5,4,3,0,0};
        int arr[] ={3,1,2};
        nextPermutationCode(arr);
        for (int i: arr){
            System.out.print(i+" ");
        }

    }
}
