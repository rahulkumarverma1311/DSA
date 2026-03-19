package arrays;

public class MissingNumberInArray {

    private static int getMissingNumber(int arr[], int n) {
        int totalSum = (n * (n + 1)) / 2;
        int arraySum = 0;
        for(int i=0 ; i< n;i++){
            arraySum += arr[i];
        }
        return totalSum - arraySum;
    }

    private static int getMissingNumberOptimize(int arr[], int n){
        int xor1 =0;
        int xor2 =0;
        for(int i=1;i<=n;i++)
            xor1 ^= i;
        for(int i=0;i< arr.length;i++){
            xor2 ^= arr[i];
        }
        return xor1 - xor2;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
    }
}
