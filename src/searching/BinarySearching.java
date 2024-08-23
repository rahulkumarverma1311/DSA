package searching;

public class BinarySearching {

    private static int binarySearch(int arr[],int n,int element){
        int start=0;
        int end = arr.length;
        while(start < end){
            int mid = (start + end)/2;
            if(arr[mid] == element){
                return mid;
            } else if (arr[mid] < element) {
                start= mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50,60};
        int n= arr.length;
        int element = 60;
        System.out.println(binarySearch(arr,n,element));

    }
}
