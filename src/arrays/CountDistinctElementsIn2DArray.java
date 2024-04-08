package arrays;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctElementsIn2DArray {

    private static Set<Integer>  getCountDistinctElements(int arr[]){
        Set<Integer> st = new HashSet<>();
        for(int i=0;i< arr.length;i++){
            if(!st.contains(arr[i])){
                st.add(arr[i]);
            }
        }
        return  st;

    }

    private static int distinct(int M[][], int N){
        Set<Integer> st = new HashSet<>();

       for(int i=0;i<M.length;i++){

       }
       return st.size();
    }
    public static void main(String[] args) {
            int arr[][] = {{2, 1, 4, 3},
                    {1, 2, 3, 2},
                    {3, 6, 2, 3},
                    {5, 2, 5, 3}};
            int n = args.length;
        System.out.println(distinct(arr,n));

    }
}
