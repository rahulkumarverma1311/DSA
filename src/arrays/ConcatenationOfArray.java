package arrays;

import java.util.HashMap;

public class ConcatenationOfArray {
    private static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] res = new int[2 * n];
        for (int i = 0; i < (2 * n); i++) {
            if (i < n) {
                res[i] = nums[i];
            } else {
                res[i] = nums[i - n];
            }
        }
        return res;
    }

    private static int[] getConcatenationOptimize(int[] nums) {
        int n = nums.length;
        int arr[] = new int [2*n];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< n;i++){
            map.put(i,nums[i]);
            arr[i] = map.get(i);
            arr[i + n] = map.get(i);
        }
        return arr;
    }


    private static int[] getConcatenationOptimizeMySolution(int[] nums) {
        int n = nums.length;
        int arr[] = new int [2*n];
        for(int i=0;i< nums.length;i++){
            arr[i] = nums[i];
            arr[i+ n] = nums[i];
        }
        return arr;
    }
    public static void main(String[] args) {
//        int arr[] = {1,2,1};
        int arr[] = {1, 3, 2, 1};
//        int ans[] = getConcatenation(arr);
        int ans[] = getConcatenationOptimize(arr);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
