package arrays;

public class MaximumIndex {

    private static int max(int arr[],int n){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return  max;
    }


    public static void main(String[] args) {
       int arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        //int arr[] = {1,10};
        int n =arr.length;
        System.out.println(max(arr,n));

    }
}
