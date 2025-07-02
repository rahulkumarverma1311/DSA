package sorting;

import java.util.Arrays;
import java.util.Comparator;

class SortAse implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

public class SmallerFirst {

    public static void main(String[] args) {
        Integer array[] = {10, 9, 7, 6, 5, 4, 3, 2};
        Arrays.sort(array, new SortAse());
        System.out.println(Arrays.toString(array));

    }
}
