package sorting;

public class BubbleSort {
    private static void bubbleSort(int arr[], int n){
       for(int i=0;i<n -1;i++){
           for(int j=0;j<n -1;j++){
               if(arr[j] > arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
    }



    private static void bubbleSortOptimize(int arr[], int n){
        for(int i=0;i<n -1;i++){
            for(int j=0;j<n -i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

private static void bubbleSortForSortedArray(int arr[],int n){
        for(int i=0;i< n-1;i++){
            boolean flag = false;
            for(int j= 0; j< n - i - 1;j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
}

    public static void main(String[] args) {
        int arr[]= {3,60,35,2,45,320,5};
//        int arr[] = {1,2,3,4,5};
        int n = arr.length;
//        bubbleSort(arr,n);
        bubbleSortOptimize(arr,n);
//        bubbleSortForSortedArray(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
