package sorting;

public class InsertionSort {


    private static void selectionSort(int arr[],int n){
        for(int i=1;i<n;i++){
            int s = arr[i];
            int j= i-1;
            while (j>=0 && arr[j] >s){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = s;
        }

    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,7};
        int n = arr.length;
        selectionSort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
