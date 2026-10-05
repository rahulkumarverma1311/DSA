package arrays;

import java.util.HashMap;
import java.util.Map;

public class CountSubArraySumEqualToK {

    private static int sumBrute(int arr[],int el){
        int count =0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum += arr[k];
                }
                if(sum == el){
                    count++;
                }
            }
        }
        return count;
    }


    private static int sumBetter(int arr[],int el){
        int count =0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+= arr[j];
                if(sum==el)
                    count++;
            }

        }
        return count;
    }


    private static int sumOptimal(int arr[],int el){
        int count =0;
        Map<Integer,Integer> map = new HashMap<>();
        int prefixSum =0;
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            prefixSum += arr[i];
            int remove = prefixSum -el;
            count += map.getOrDefault(remove,0);
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);

        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,-3,1,1,1,4,2,-3};
        System.out.println(sumOptimal(arr,3));

    }
}
