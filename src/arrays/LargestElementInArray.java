package arrays;

public class LargestElementInArray {

    private static int getLargestElementInArray(int arr[],int n){
        int max=0;
        for(int i=1;i<n;i++){
            if(arr[i] > arr[max])
                max=i;
        }

        return max;
    }



    public static void main(String[] args) {
        int arr[] = {110,2,3,34,54,76};
        int n = arr.length;
        System.out.println(getLargestElementInArray(arr,n));



    }
}
