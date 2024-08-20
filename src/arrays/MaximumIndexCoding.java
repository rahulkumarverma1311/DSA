package arrays;

public class MaximumIndexCoding {
// n*n
    private static int maxIndexDiff(int[] arr) {
        int res= Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]<= arr[j] ){
                    int diff = j-i;
                    if(diff> res){
                        res= diff;
                    }

                }
            }
        }
        return res;
    }





    public static void main(String[] args) {

        //int arr[]= {34, 8, 10, 3, 2, 80, 30, 33, 1};
        int arr[] = {1,10};
        System.out.println(maxIndexDiff(arr));

    }
}
