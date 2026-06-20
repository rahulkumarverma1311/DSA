package searching;

import java.util.HashMap;
import java.util.Map;

public class MoreThanNByKOccurrences {
    private static int findElement(int arr[],int N,int k){
        int ocr = arr.length / k;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int n : arr){
            hmap.put(n,hmap.getOrDefault(n,0)+1);
        }
        int count =0;
        for (Map.Entry<Integer,Integer> m : hmap.entrySet()){
            if(m.getValue() > ocr)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 2, 1, 2, 3, 3};
        int n =arr.length;
        System.out.println(findElement(arr,n,4));

    }
}
