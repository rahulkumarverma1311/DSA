package searching;

public class LinearSearch {
    private static int linearSearching(int arr[],int n,int element){
        for(int i =0;i<n;i++){
            if(arr[i]== element)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]= {1,3,5,3,1,2,7,4};
        int n = arr.length;
        int element = 2;
        System.out.println("the index of element :- "+linearSearching(arr,n,element));
    }
}
