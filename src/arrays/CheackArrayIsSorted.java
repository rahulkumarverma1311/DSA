package arrays;

public class CheackArrayIsSorted {

    private static boolean isSorted(int arr[],int n){
       if(n ==0)
           return true;
       if(n==1)
           return true;
       for(int i=0;i<=n;i++){
           if(arr[i] > arr[i+1]){
               return false;
           }
       }
       return true;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n= args.length;
        System.out.println(isSorted(arr,n));


    }
}
