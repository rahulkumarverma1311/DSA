package arrays;

public class MoveZeroAtEnd {


    private static void zeroAtEndOptimize(int arr[],int n){
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0 ){
                

            }
        }
    }


    private static void zeroAtEnd(int arr[],int n){
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                for(int j=i+1;j<n;j++){
                    if(arr[j] !=0){
                        int temp =  arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;

                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {8,5,0,20,0};
        int n = arr.length;
        //zeroAtEnd(arr,n);

        zeroAtEndOptimize(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
