package arrays;

public class ReverseAnArray {
    private static void reverseArray(int arr[],int n){
        int low =0 ;
        int high = arr.length-1;
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        System.out.println("before reverse");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("after reverse");
        reverseArray(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
