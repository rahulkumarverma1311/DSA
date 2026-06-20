package searching;

public class IndexOfFirstOccurrenceInSorted {

    private static int firstOccurrenceRecursive(int arr[] ,int low,int high,int element){

        if(low > high)
            return -1;
        int mid = (low + high )/ 2;
        if(element > arr[mid]){
            return firstOccurrenceRecursive(arr,mid+1,high,element);
        } else if (element < arr[mid]) {
            return firstOccurrenceRecursive(arr,low,mid-1,element);
        }else {
            if(mid == 0 || arr[mid -1] != arr[mid]){
                return mid;
            }else{
                return firstOccurrenceRecursive(arr,low,mid-1,element);
            }
        }
    }



    private static int firstOccurrence(int arr[],int low,int high,int element){
        while(low <= high){
            int mid  = (low + high)/2;
            if(arr[mid] < element){
                low = mid + 1;
            } else if (arr[mid] > element) {
                high = mid +1;
            }else{
                if(mid ==0 || arr[mid] != arr[mid -1]){
                    return mid;
                }else{
                    high = mid -1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={5,10,10,20,20,20};
        System.out.println(firstOccurrence(arr,0,arr.length-1,20));

    }
}
