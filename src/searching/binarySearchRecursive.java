package searching;

public class binarySearchRecursive {

    private static int binarySearchingRecursive(int arr[],int element,int start,int end){

        if(start>end){
            return -1;
        }

        int mid = (start+end)/2;
        if(arr[mid] == element){
            return mid;
        } else if (arr[mid]< element) {
            return binarySearchingRecursive(arr,element,mid+1,end);
        }else {
            return binarySearchingRecursive(arr,element,start,mid-1);
        }

    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};

        int element = 60;
        System.out.println(binarySearchingRecursive(arr,element,0, arr.length));
    }
}
