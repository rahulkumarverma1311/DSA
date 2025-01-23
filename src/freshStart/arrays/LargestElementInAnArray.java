package freshStart.arrays;

public class LargestElementInAnArray {


    private static int getLargestElement(int arr[],int n){
        int res=arr[0];
        for(int i =1;i<n;i++){
            if(res < arr[i]){
                res = arr[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        System.out.println(getLargestElement(arr,n));

    }
}
