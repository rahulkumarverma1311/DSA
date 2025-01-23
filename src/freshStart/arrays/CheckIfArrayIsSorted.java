package freshStart.arrays;

public class CheckIfArrayIsSorted {

    private static boolean isSortedNaive(int arr[],int n){
            for (int i=0;i<n;i++){
                for (int j=i+1 ;j<n;j++){
                    if (arr[j]< arr[i])
                            return false;
                }
            }
            return true;
    }
    private static boolean isSorted(int arr[],int n){

        for(int i=1;i<n;i++){
            if(arr[i] < arr[i-1])
                return false;
        }
        return true;
    }


    private static String checkSortedAscDesc(int arr[],int n){
        if(arr[0]< arr[1]){
            for(int i=1;i<n;i++){
                if(arr[i] < arr[i-1])
                    return "not sorted";
            }
            return "sorted in ase";

        }else{
            for(int i=1;i<n;i++){
                if(arr[i] > arr[i-1])
                    return "not sorted";
            }
            return "sorted in desc";
        }
    }


    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
//    int arr[] = {1,2,3,4,5};
//        System.out.println(i
//        sSorted(arr, arr.length));
//        System.out.println(isSortedNaive(arr, arr.length));
        System.out.println(checkSortedAscDesc(arr, arr.length));

    }
}
