package searching;

public class SingleElementInSortedArray {
    private static int singleNonDuplicateBasic(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums[i] != nums[i + 1]) {
                    return nums[i];
                }
            } else if (i == nums.length - 1) {
                if (nums[i] != nums[i - 1]) {
                    return nums[i];
                }
            } else {
                if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                    return nums[i];
                }
            }
        }
        return -1;
    }

    private static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        if (nums[0] != nums[1])
            return nums[0];
        if (nums[n - 1] != nums[n - 2]) {
            return nums[n - 1];
        }
        int low = 1;
        int high = n - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] != nums[mid -1] && nums[mid]!= nums[mid +1]){
                return nums[mid];
            }
            if((mid %2 ==1 && nums[mid -1] == nums[mid]) ||mid %2 ==0 && nums[mid +1] == nums[mid] ){
                    low =mid+1;
            }else{
                high = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 3, 4, 4, 8, 8};
//        System.out.println(singleNonDuplicateBasic(arr));
        System.out.println(singleNonDuplicate(arr));
    }
}
