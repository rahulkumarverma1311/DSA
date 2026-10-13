package bitMappings;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberTwo {
    private static int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue() ==1){
                return m.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,3,2};
        System.out.println(singleNumber(arr));
    }
}
