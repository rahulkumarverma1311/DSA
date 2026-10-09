package searching;

public class HowManyTimesArrayHasBeenRotated {


    private static int getRotateCount(int arr[]){
        int low= 0;
        int high= arr.length-1;
        int ans = Integer.MAX_VALUE;
        int idx =-1;
        while(low <= high){
            int mid  = low + (high - low )/2;
            if(arr[low] < arr[high]){
                if(arr[low] < ans){
                    idx= low;
                    ans = arr[low];
                }
//                ans = Math.min(ans,arr[low]);
                break;
            }
//            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
//                ans = Math.min(ans ,arr[low]);
//                low++;
//                high--;
//                continue;
//            }
            if(arr[low] <=  arr[mid]){
                if(arr[low] < ans){
                    idx =low;
                    ans = arr[low];
                }
//                ans = Math.min(ans,arr[low]);
                low = mid +1;
            }else {
                if(ans < arr[mid]){
                    idx=mid;
                    ans = arr[mid];
                }
//                ans = Math.min(ans,arr[mid]);

                high = mid -1;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        System.out.println(getRotateCount(arr));

    }
}
