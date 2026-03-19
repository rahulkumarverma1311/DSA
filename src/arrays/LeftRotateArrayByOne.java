package arrays;

public class LeftRotateArrayByOne {

    private static void leftRotateByOne(int arr[], int n){
        int temp =  arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
    public static void main(String[] args) {
            int arr[] = {1,2,3,4,5};
            int n = arr.length;
            leftRotateByOne(arr,n);
            for(int i : arr){
                System.out.print(i + " ");
            }
    }
}
