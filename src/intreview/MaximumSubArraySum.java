package intreview;

import com.sun.xml.internal.ws.encoding.MtomCodec;

public class MaximumSubArraySum {
    private static int bruteForceApproach(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = 0; j < arr.length; j++) {
                currSum += arr[j];
            }
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }


    private static int optimalApproach(int nums[]) {
        int len = nums.length;
        if (len == 0) return 0;
        int sum = 0;
        int largest = nums[0];
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            if (sum > largest) largest = sum;
            if (sum < 0) sum = 0;
        }
        return largest;
    }
    private static void optimalApproachPrintIndex(int nums[]) {
        int len = nums.length;
        if (len == 0) return;
        int sum = 0;
        int largest = nums[0];
        int ansStart =-1;
        int ansend =-1;
        for (int i = 0; i < len; i++) {
            if(sum==0)
                ansStart = i;
            sum += nums[i];
            if (sum > largest) {
                largest = sum;
                ansStart= ansStart;
                ansend=i;
            }
            if (sum < 0) sum = 0;
        }
        System.out.println("start index:"+ ansStart +" and end index:"+ ansend);
    }

    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//        System.out.println(bruteForceApproach(arr));
//        System.out.println(optimalApproach(arr));
        optimalApproachPrintIndex(arr);
    }

}
