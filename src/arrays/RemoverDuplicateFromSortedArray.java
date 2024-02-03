package arrays;

public class RemoverDuplicateFromSortedArray {
    // naive approach
    private static int getSizeOfArrayAfterRemovingDuplicate(int arr[],int n){
        int temp[]=new int[n];
        temp[0] = arr[0];
        int res = 1;
        for(int i=1;i<n;i++){
            if( temp[res-1] != arr[i]){
                temp[res] = arr[i];
                res++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }
        return res;

    }


    // optimal approach

    private static int removeDuplicate(int arr[],int n){
        int res=1;
        for(int i=1;i<n;i++){
            if(arr[i] != arr[res-1]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,20,30,30,30};
        int n =  arr.length;

//        System.out.println(getSizeOfArrayAfterRemovingDuplicate(arr,n));

        System.out.println(removeDuplicate(arr,n));


    }
}
