package arrays;

import java.util.ArrayList;

public class MaxAndSecondMaxProblem {

    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        ArrayList<Integer> al = new ArrayList<Integer>();

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i=0;i<sizeOfArray;i++){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            }else if(arr[i]> max && arr[i] > secMax){
                secMax = arr[i];
            }
            if(secMax == Integer.MIN_VALUE)
                secMax = -1;

        }
        al.add(max);
        al.add(secMax);
        return al;


    }

    public static void main(String[] args) {
        int arr[] = {2,2,2};
        int n = arr.length;

        System.out.println(largestAndSecondLargest(n,arr));

    }
}
