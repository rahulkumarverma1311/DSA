package freshStart.arrays;

public class SecondLargestElementInArray {


    private static int getSecondLargestElement(int arr[], int n){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0;i < n ; i++){
            if(arr[i]> largest){
                secondLargest=largest;
                largest= arr[i];
            }else if(arr[i]< largest && arr[i]> secondLargest){
                secondLargest= arr[i];
            }
        }
        return secondLargest;
    }
    private static int getSecondLargestElementIndex(int arr[],int n){
        int largest = 0;
        int secondLargest=-1;
        for(int i=0;i <n;i++){
            if(arr[i] > arr[largest]){
                secondLargest = largest;
                largest = i;
            }else if(arr[i] < arr[largest] && arr[i]> arr[secondLargest]){
                secondLargest = i;
            }

        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;


        System.out.println("get second largest element of an array:-"+ getSecondLargestElement(arr,n));
        System.out.println("get second largest element's index of an array:-"+ getSecondLargestElementIndex(arr,n));

    }
}
