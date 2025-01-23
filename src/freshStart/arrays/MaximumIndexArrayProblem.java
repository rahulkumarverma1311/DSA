package freshStart.arrays;

public class MaximumIndexArrayProblem {

//    Given an array arr of positive integers. The task is to return the maximum of j - i subjected to the constraint of arr[i] < arr[j] and i < j.
//
//    Examples:
//
//    Input: arr[] = [1, 10]
//    Output: 1
//    Explanation: arr[0] < arr[1] so (j-i) is 1-0 = 1.
//    Input: arr[] = [34, 8, 10, 3, 2, 80, 30, 33, 1]
//    Output: 6
//    Explanation: In the given array arr[1] < arr[7] satisfying the required condition(arr[i] < arr[j]) thus giving the maximum difference of j - i which is 6(7-1).
//    Expected Time Complexity: O(n)
//    Expected Auxiliary Space: O(n)
//
//    Constraints:
//            1 ≤ arr.size ≤ 106
//            0 ≤ arr[i] ≤ 109

    private static int maxIndexDifferance(int arr[]){
        int i=0;
        int j= arr.length-1;
        int res=0;
        while (j>i){

            if(arr[i]<=arr[j]){
                res= Math.max(res,(j-i));
                i++;
                j--;
            }else {
                i++;
               if(arr[i]> arr[j]){
                   j--;
                   i++;
               }

            }
        }
        return res;


    }


   private  static int maxIndexDiff(int A[], int N) {

        // Your code here
        int indexMin[] = new int [N];
        int indexMax[] = new int[N];
        indexMin[0] = A[0];
        indexMax[N-1] = A[N-1];

        for(int i=1;i<N;i++){
            indexMin[i] = Math.min(A[i],indexMin[i-1]);
        }

        for(int i=N-2;i>-1;--i){
            indexMax[i] = Math.max(A[i],indexMax[i+1]);
        }

        int i=0,j=0,ans=0;
        while(i<N && j<N){
            if(indexMin[i] <= indexMax[j]){
                ans = Math.max(ans,j-i);
                j++;
            }else{
                i++;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
//        int arr[] = {1,10};
//        28 19 21 14 24 22 16 15 22 16 22 19 27 8 27
//        int arr[] = {34,8,10,3,2,80,30,33,1};
        int arr[]= {28,19,21,12,24,22,16,15,22,16,22,19,27,8,27};
        System.out.println(maxIndexDifferance(arr));

//        System.out.println(maxIndexDiff(arr, arr.length));

    }



}
