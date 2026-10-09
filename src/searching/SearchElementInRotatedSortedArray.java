package searching;

public class SearchElementInRotatedSortedArray {



    private static int searchElement(int arr[], int n, int k) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if(arr[low] <= arr[mid]){
                if (arr[low] <= k && k < arr[mid]) {
                    high = mid - 1;
                }else{
                    low = mid +1;
                }
            }else{
                if(arr[mid] <= k && k < arr[high]){
                    low = mid +1;
                }else{
                    high = mid -1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
            int arr[] = {4,5,6,7,0,1,2};
            int n = arr.length;
            int k = 0;
        System.out.println(searchElement(arr,n,k));
    }
}
