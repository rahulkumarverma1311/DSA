package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {


    private static int longestConsecutiveSequenceCount(int arr[]){
        Arrays.sort(arr);
        int longestSequence =1;
        int lastSmaller = Integer.MIN_VALUE;
        int currentSequenceCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]   -1 == lastSmaller){
                    currentSequenceCount++;
                    lastSmaller = arr[i];
            } else if (arr[i] != lastSmaller) {
                currentSequenceCount =1;
                lastSmaller = arr[i];
            }
            longestSequence = Math.max(currentSequenceCount,longestSequence);
        }
        return longestSequence;

    }

    private static int longestConsecutiveSequenceCountOptimal(int arr[]){
        int n = arr.length;
        int longest =1;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }

        for(int i : set){
            if(!set.contains(i -1)){
                int cnt =1;
                int x= i;
                while (set.contains(x +1)){
                    x= x +1;
                    cnt = cnt+1;
                }
                longest = Math.max(longest,cnt);
            }

        }
        return longest;
    }

    public static void main(String[] args) {
            int arr[] = {100,102,100,101,101,4,3,2,3,2,1,1,1,2};

        System.out.println(longestConsecutiveSequenceCount(arr));
        System.out.println(longestConsecutiveSequenceCountOptimal(arr));
    }
}
