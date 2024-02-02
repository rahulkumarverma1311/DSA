package arrays;

public class CheckIfArrayIsSortedAndRotatedProb {
    // logic:- if array is sorted in any order then it can not be rotated
    private static boolean isCheckIfArrayIsSortedAndRotated(int arr[],int n){
        int incr =0;
        int decr=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]> arr[i+1] && arr[0]> arr[n-1])
                decr++;
            if(arr[i]<arr[i +1] && arr[0]< arr[n-1])
                incr++;
        }

        if(decr==1 || incr==1)
            return true;
        else
            return false;
    }



    public static void main(String[] args) {
        int arr[] = {3,2,1};
        int n = arr.length;

        System.out.println(isCheckIfArrayIsSortedAndRotated(arr,n));
    }

}
