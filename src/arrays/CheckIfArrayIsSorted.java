package arrays;

public class CheckIfArrayIsSorted {
    // naive approach
    private static boolean isSortedNaive(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i])
                    return false;
            }
        }
        return true;
    }
    // optimal approach

    private static boolean isSorted(int arr[],int n){
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

        int arr[] = {8,12,15};
        int n = arr.length;
        System.out.println("naive approach:-"+ isSortedNaive(arr,n));
        System.out.println("optimal approach:-"+ isSorted(arr,n));

    }
}
