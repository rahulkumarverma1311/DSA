package slidingWindow;

public class MaximumPointsYouCanObtainFromCards {
    private static int maxScore(int[] cardPoints, int k) {
        int leftSum=0;
        int rightSum=0;
        int maxSum=0;
        for(int i=0;i<k;i++){
            leftSum += cardPoints[i];
        }
        maxSum = leftSum;
        int rightIdx= cardPoints.length -1;
        for(int j = k-1;j>=0;j--){
            leftSum -= cardPoints[j];
            rightSum += cardPoints[rightIdx];
            rightIdx--;
            maxSum = Math.max(maxSum,leftSum+rightSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,1};
        int k=3;
        System.out.println(maxScore(arr,k));

    }
}
