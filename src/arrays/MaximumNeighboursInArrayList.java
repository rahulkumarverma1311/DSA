package arrays;

import java.util.ArrayList;

public class MaximumNeighboursInArrayList {
    /*
    banner
Given an ArrayList arr of N positive integers. The task is to find the maximum for every adjacent pairs in the ArrayList.

Example 1:

Input:
6
1 2 2 3 4 5

Output:
2 2 3 4 5

Explanation:
Maximum of arr[0] and arr[1] is 2, that of arr[1] and arr[2]
is 2, ... and so on. For last two elements, maximum is 5.
Example 2:

Input:
2
5 5

Output:
5

Explanation:
We only have two elements so max of 5 and 5 is 5 only.
User Task:
The task is to complete the function maxNeighbour(), which takes the ArrayList as parameter and returns the output ArrayList. The drivercode will then print it.

Constraints:
2 <= N <= 106
1 <= arri <= 106
     */

    private static ArrayList<Integer> maxNeighbour(ArrayList<Integer>arr)
    {
        ArrayList<Integer>al = new ArrayList<>();
        for(int i=1;i< arr.size();i++){
            int max = Math.max(arr.get(i), arr.get(i-1));
            al.add(max);


        }
        return al;


    }
    public static void main(String[] args) {
        ArrayList<Integer>al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(maxNeighbour(al));


    }
}

