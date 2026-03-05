package intreview;

import java.util.HashMap;

public class TwoSumSelf {

    public static int[]  brutForceApproch(int arr[] , int target){
        int res = 0;
        int ans[] = new int [2];
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length ;j++){
                res  = arr[i] + arr[j];
                if(res == target){
                    ans[0]=i;
                    ans[1] = j;
                }

            }
        }
        return ans;
    }
    private static boolean hashingMethod(int arr[] ,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i< arr.length;i++){
            int currentEl = arr[i];
            int remain = target - currentEl;
            if(map.containsKey(remain)){
                return true;
            }
            map.put(currentEl,i);
        }
        return false;
    }

    private static int [] hashingWthIndex(int arr[] ,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< arr.length;i++){
            int currentEl = arr[i];
            int remain = target - currentEl;
            if(map.containsKey(remain))
                return new int[] {map.get(remain),i};
            map.put(currentEl,i);
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
            int arr[] ={2,6,5,8,11};
            int targer = 14;
//            int[] test = brutForceApproch(arr,targer);
//            for(int n : test){
//                System.out.print(n + " ");
//            }
//
//        System.out.println(hashingMethod(arr,targer));


        int[] test = hashingWthIndex(arr,targer);
        for(int n : test){
            System.out.print(n + " ");
        }


    }
}
