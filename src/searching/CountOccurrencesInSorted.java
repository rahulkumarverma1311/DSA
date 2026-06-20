package searching;

public class CountOccurrencesInSorted {
    private static int firstOccer(int arr[],int x){
        int low =0;
        int high = arr.length-1;
        while(low <= high){
            int mid  = (low + high)/2;
            if(arr[mid] >x)
                high = mid -1;
            else if (arr[mid] < x)
                low = mid +1;
            else{
                if(mid == 0 || arr[mid] != arr[mid -1])
                    return mid;
                else
                    high = mid -1;

            }
        }
        return -1;
    }

    private static int lastOccer(int arr[],int x){
        int low =0;
        int high = arr.length-1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x)
                high = mid - 1;
            else if (arr[mid] < x)
                low = mid + 1;
            else {
                if (mid == arr.length - 1 || arr[mid] != arr[mid + 1])
                    return mid;
                else
                    low = mid + 1;

            }
        }
        return -1;
    }

    private static int countOccer(int arr[],int n,int x){
        int start = firstOccer(arr,x);
        if(start ==-1)
            return -1;
        int end = lastOccer(arr,x);
        return (end - start) + 1;
    }
    public static void main(String[] args) {
        int arr[] ={5,10,10,20,20,20};
        System.out.println(countOccer(arr,arr.length,20));

    }
}
