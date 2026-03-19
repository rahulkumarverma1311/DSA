package arrays;

public class LeftRotateAnArrayByDPlaces {
    // naive solution
    private static void leftRotateByOne(int arr[], int n){
        int temp =  arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }


    private static void leftRotateByDTimeNaive(int arr[],int n,int d){
        for(int i=1;i<=d;i++){
            leftRotateByOne(arr,n);
        }
    }

    // left rotate with o(n) extra space

    private static void leftRotateByDTimeWIthExtraSpace(int arr[],int n,int d){
        int temp[] = new int [n];

        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }
        for(int j= d;j<n;j++){
            arr[j -d] = arr[j];
        }
        for(int k = 0; k <d ; k++){
            arr[n-d+k] = temp[k];
        }
    }

    private static void reverseArray(int arr[],int low ,int high){
        while (low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    private static void leftRotateArrayOptimize(int arr[],int n,int d){
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,n-1);
        reverseArray(arr,0,n-1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
//        leftRotateByDTimeNaive(arr,n,2);
//        leftRotateByDTimeWIthExtraSpace(arr,n,2);
        leftRotateArrayOptimize(arr,n,2);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
