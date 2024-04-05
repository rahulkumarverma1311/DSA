package arrays;

import java.util.ArrayList;
import java.util.List;

public class SimpleArraySum {
    private static int getArraySum(List<Integer>al){
        Integer arr[] = new Integer[al.size()];
        arr = al.toArray(arr);

        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(getArraySum(al));


    }
}
