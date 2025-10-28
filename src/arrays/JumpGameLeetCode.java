package arrays;

public class JumpGameLeetCode {
    private static boolean canJump(int[] nums) {
        int maxIdx = 0;
        for(int i=0;i< nums.length;i++){
            if(i > maxIdx)
                return false;
            maxIdx = Math.max(maxIdx,i + nums[i]);
            if(maxIdx >= nums.length -1)
                return true;
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,1,4};
        System.out.println(canJump(arr));
    }
}
