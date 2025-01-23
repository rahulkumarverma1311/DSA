package freshStart.arrays;

import java.util.Arrays;

public class CheckIfArrayIsSortedAndRotated {

    public static boolean checkRotatedAndSorted(int arr[], int num){
            int desc=0;
            int asc=0;
        for(int i=1;i<num;i++){
            if(arr[i]<arr[i-1] && arr[0] < arr[num-1]){
                    desc++;
            }
            if(arr[i]> arr[i-1] && arr[0] > arr[num-1]){
                asc++;
            }

        }
            if(desc ==1 || asc==1)
                return true;
            else return false;
    }
//    private static String checkSortedAscDesc(int arr[],int n){
//        if(arr[0]< arr[1]){
//            for(int i=1;i<n;i++){
//                if(arr[i] < arr[i-1])
//                    return "not sorted";
//            }
//            return "sorted in ase";
//
//        }else{
//            for(int i=1;i<n;i++){
//                if(arr[i] > arr[i-1])
//                    return "not sorted";
//            }
//            return "sorted in desc";
//        }
//    }
//    private static boolean checkRotatedAndSorted(int arr[], int num){
//        Arrays.sort(arr);
//        String ase ="sorted in ase";
//        String desc = "sorted in desc";
//        String check = checkSortedAscDesc(arr,num);
//        if(check== ase){
//            if(arr[0]< arr[num-1])
//                return true;
//            else
//                return false;
//        } else if (check==desc) {
//            if(arr[0]> arr[num-1])
//                return true;
//            else
//                return false;
//        }else {
//            return false;
//        }
//    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int n= arr.length;
        System.out.println(checkRotatedAndSorted(arr,n));
    }
}
