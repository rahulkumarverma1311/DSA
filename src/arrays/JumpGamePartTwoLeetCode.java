package arrays;

public class JumpGamePartTwoLeetCode {
    private static int jumpCount(int[] nums) {
        if (nums.length <= 1)
            return 0;
        int longestJump = 0;
        int currEnd = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            longestJump = Math.max(longestJump, i + nums[i]);
            if (i == currEnd) {
                count++;
                currEnd = longestJump;
                if (currEnd >= nums.length - 1) {
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 1, 1};
        System.out.println(jumpCount(arr));
    }
}
