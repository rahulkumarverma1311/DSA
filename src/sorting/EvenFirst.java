package sorting;

import java.util.Arrays;
import java.util.Comparator;

class MySort implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
         return o1 % 2 - o2 % 2;
    }
}
public class EvenFirst {
    public static void main(String[] args) {
        Integer arr[] = {1,2,4,6,5,7,9,21,22};
        Arrays.sort(arr,new MySort());
        System.out.println(Arrays.toString(arr));
    }
}
