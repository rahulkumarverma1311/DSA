package arrays;

public class ArrayInsertAtIndex {
    private static void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        for(int i=sizeOfArray-2;i>=index;i--){
            arr[i+1] = arr[i];
        }
        arr[index] = element;

    }

    public static void main(String[] args) {

        int arr[] = new int [6];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        int index = 5;
        int element= 90;
        insertAtIndex(arr,6,index,element);
        for(int ele: arr){
            System.out.println(ele);
        }



    }
}
