package arrays;

import java.util.ArrayList;

public class BinarySearchOnArrayList {
    private static int binarySearchAL(ArrayList<Integer> arr, int x)
    {
        //Your code here
        //If x in arr return 1, else return -1

        int min= 0;
        int max = arr.size() -1;
        while(max >= min){
            int mid = (min + max) / 2;
            if(arr.get(mid) == x)
                return 1;
            else if(x > arr.get(mid)){
                min = mid+1;
            }else{
                max = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
