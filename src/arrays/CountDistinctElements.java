package arrays;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctElements {

    private static int  getCountDistinctElements(int arr[],int n){
        Set<Integer> st = new HashSet<>();
        for(int i=0;i< arr.length;i++){
            if(!st.contains(arr[i])){
                st.add(arr[i]);
            }
        }
        return  st.size();

    }



    public static void main(String[] args) {

        int arr[] = {1,32,1,2,32,34};
        int n = arr.length;
        System.out.println(getCountDistinctElements(arr,n));


    }
}
