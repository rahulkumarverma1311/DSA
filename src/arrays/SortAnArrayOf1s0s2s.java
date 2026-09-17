package arrays;

public class SortAnArrayOf1s0s2s {

    private static void sortApproachOne(int arr[]){
        int zeros =0;
        int ones =0;
        int twos =0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] ==0)
                zeros++;
            if(arr[i] == 1)
                ones++;
            if(arr[i] == 2)
                twos++;
        }

        for(int i =0;i<zeros;i++){
            arr[i] = 0;
        }
        for(int i = zeros;i<zeros + ones;i++){
            arr[i] =1;
        }
        for(int i= ones+ zeros;i<arr.length;i++){
            arr[i]= 2;
        }

    }



    private static void sortOptimalApproach(int arr[]){
        int low =0;
        int mid =0;
        int high = arr.length-1;

        while(mid <=high){
            if(arr[mid] ==0){
                int temp= arr[mid];
                arr[mid] =  arr[low];
                arr[low] = temp;
                mid++;
                low++;
            } else if (arr[mid] ==1) {
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }

        }

    }
    public static void main(String[] args) {


        int arr[] = {0,1,2,0,1,2,1,2,0,0,0,1};
//        sortApproachOne(arr);
        sortOptimalApproach(arr);
        for(int i: arr){
            System.out.print(i +" ");
        }

    }
}
