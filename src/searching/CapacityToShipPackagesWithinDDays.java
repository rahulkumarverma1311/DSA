package searching;

public class CapacityToShipPackagesWithinDDays {

    private static int shipWithinDays(int[] weights, int days) {
        int low = getMax(weights);
        int high = (int )sum(weights);
        while(low <= high){
            int mid = (low + high) /2;
            int noOfDays = findDaysRequire(weights,mid);
            if(noOfDays <= days){
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return low;
    }

    private static int findDaysRequire(int[] weights, int capacity) {
        int day =1;
        int load=0;
        for(int i=0;i< weights.length;i++){
            if(load + weights[i] > capacity){
                day = day+1;
                load = weights[i];
            }else {
                load += weights[i];
            }
        }
        return day;
    }


    private static long sum(int arr[]){
        long sum =0;
        for(int i=0;i< arr.length;i++){
            sum += arr[i];
        }

        return sum;
    }

    private static  int getMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int day = 5;
        System.out.println(shipWithinDays(arr,day));
    }
}
