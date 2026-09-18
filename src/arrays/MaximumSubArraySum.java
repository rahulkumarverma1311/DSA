package arrays;

public class MaximumSubArraySum {

    private static int getMaxSumOfSubArray(int arr[]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                sum = Math.max(sum, currentSum);
            }

        }
        return sum;
    }


    private static int getMaxSubArraySumOptimized(int arr[]) {
        int sum = arr[0];
        int current = 0;
        for (int i = 0; i < arr.length; i++) {
            current += arr[i];
            if (current > sum) {
                sum = current;
            }
            if (current < 0)
                current = 0;
        }
        return sum;
    }

    public static void main(String[] args) {

        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//        System.out.println(getMaxSumOfSubArray(arr));
        System.out.println(getMaxSubArraySumOptimized(arr));

    }
}
