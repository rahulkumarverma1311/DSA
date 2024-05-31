package arrays;

import java.util.ArrayList;

public class MinimumVerticalSum {
    private static int minimum_vertical_sum(ArrayList<ArrayList<Integer>> arr)
    {


        int maxListSize =0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.size();i++){
            maxListSize = Math.max(arr.get(i).size(),maxListSize);
        }

        for(int i=0;i<maxListSize;i++){
            int temp =0 ;
            for(int j=0;j<arr.size();j++){
                if(i<arr.get(j).size()){
                    temp += arr.get(j).get(i);
                }
            }
            min = Math.min(min,temp);
        }
        return min;
    }

    public static void main(String[] args) {





    }
}
