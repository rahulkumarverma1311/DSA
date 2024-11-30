package searching;

public class SortedArraySearchSearchingProb1 {
    private static int searchInSorted(int arr[], int N, int K) {
            int start=0;
            int end =  N-1;
            while (start<end){
                int mid = (start+ end)/2;
               if(arr[mid]==K){
                   return 1;
               }else if(arr[mid]<K){
                   start = mid+1;
               }else{
                   end = mid-1;
               }
            }
            return -1;
    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,6};
        System.out.println(searchInSorted(arr,arr.length,3));

    }
}
