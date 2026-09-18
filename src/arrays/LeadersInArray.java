package arrays;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    private static List<Integer> leaders(int arr[]){
        List<Integer> res = new ArrayList<>();
        int currentLeader = Integer.MIN_VALUE;


        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] > currentLeader){
                res.add(arr[i]);
                currentLeader = arr[i];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr [] ={10,22,12,3,0,6};
        List<Integer> ans = leaders(arr);
        for(int i : ans){
            System.out.print(i+" ");
        }
    }
}
