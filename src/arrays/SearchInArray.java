package arrays;

public class SearchInArray {

    private static int getIndexOfElement(int arr[], int n,int element){
        for(int i=0;i<n;i++){
            if(arr[i] == element)
                return i;
        }

        return -1;
    }



    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        System.out.println("element found at :-"+getIndexOfElement(arr,n,4));


    }
}
