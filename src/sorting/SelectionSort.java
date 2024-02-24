package sorting;

public class SelectionSort {
    private static void selectionSort(int arr[],int n){
       for(int i=0;i<n;i++){
           int min = i;
           for(int j=i+1;j<n;j++){
               if(arr[j]< arr[min]){
                   min = j;
               }
           }
           int temp = arr[i];
           arr[i] = arr[min];
           arr[min] = temp;
       }
    }
private static void selectionSortNaive(int arr[],int n){
        int temp[] = new int[n];
        for(int i=0;i<n;i++){
            int min=0;
            for(int j=1;j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            temp[i] = arr[min];
            arr[min] = Integer.MAX_VALUE;


        }
    for(int i=0;i<n;i++){
        arr[i] = temp[i];
    }
}
    public static void main(String[] args) {
        int arr[]  =  {2, 1, 4, 3};
        int n = arr.length;
        //selectionSortNaive(arr,n);
        selectionSort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
    }
}
