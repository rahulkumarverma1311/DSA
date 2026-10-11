package searching;

public class MinimumNumberOfDaysToMakemBouquets {

    private static int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if((long)m * k >n){
            return -1;
        }


        int low = findLowestElement(bloomDay);
        int high = findHigestElement(bloomDay);

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isPossible(bloomDay,mid,m,k)){

                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return low;
    }



    private static boolean isPossible(int arr[],int day,int m,int k){
        int count =0;
        int bloomF =0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] <= day){
                count++;
            }else{
                bloomF += (count/k);
                count=0;
            }
        }
        bloomF += count/k;
        if(bloomF >= m){
            return true;
        }
        return false;
    }

    private static int findLowestElement(int[] arr) {
        int min = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }

        return arr[min];
    }
    private static int findHigestElement(int arr[]){
        int max=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[max])
                max=i;
        }

        return arr[max];

    }
    public static void main(String[] args) {
        int arr[] ={7,7,7,7,12,7,7};
        System.out.println(minDays(arr,2,3));
    }
}
