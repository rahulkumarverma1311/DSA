package arrays;

public class InsertInArray {

    private static int inserInArray(int arr[],int n,int cap,int element,int position){
        if(n == cap)
            return n;
        int indexOfElement = position-1;

        for(int i = n-1;i>=indexOfElement;i--){
            arr[i+1] = arr[i];
        }
        arr[indexOfElement] = element;
        return n+1;
    }

    public static void main(String[] args) {
        int arr[] = new int [5];
        int cap = 5;
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        int position = 3;
        int element = 3;
        int n = arr.length;
        System.out.println(inserInArray(arr,n,cap,element,position));
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }

    }
}
