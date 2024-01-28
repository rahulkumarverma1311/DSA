package arrays;

public class DeletionInArray {

    private static int deleteElement(int arr[],int n , int element){
        int i;
        for(i=0;i<n;i++){
            if(arr[i] == element)
                break;
        }
        if(i == n)
            return n;
        for(int j=i;j<n-1;j++){
            arr[j] = arr[j+1];
        }
        return n-1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int element=3;
        System.out.println(n);
        for (int el:arr){
            System.out.println(el);
        }
        System.out.println(deleteElement(arr,n,element));
        System.out.println();
        for (int el:arr){
            System.out.println(el);
        }
    }
}
