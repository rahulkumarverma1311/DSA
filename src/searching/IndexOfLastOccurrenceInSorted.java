package searching;

public class IndexOfLastOccurrenceInSorted {
    private static int search(int arr[],int n,int low ,int high,int element){
        while (low <= high){
            int mid = (low + high)/2;
            if(arr[mid] > element){
                high = mid -1;
            }else if (arr[mid] < element){
                low =mid + 1;
            }else{
                if(mid == n-1 || arr[mid] != arr[mid+1]){
                    return mid;
                }else{
                   low = mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={5,10,10,20,20,20};
        System.out.println(search(arr,arr.length,0,arr.length-1,20));
    }
}
