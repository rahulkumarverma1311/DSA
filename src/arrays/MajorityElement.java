package arrays;

public class MajorityElement {

    private static int findMajorityElement(int arr[], int n){
        for(int i=0;i<n;i++){
            int count=1;
            for(int j= i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > (n/2)){
                return i;
            }

        }
        return -1;



    }

    private static int findMajorityElementOptimize(int arr[], int n){
        int res=0;
        int count =1;
        for(int i=1;i<n;i++){
            if(arr[res] == arr[i]){
                count++;
            }else {
                count--;
            }
            if(count ==0){
                res = i;
                count=1;
            }
        }
        count=0;
        for(int i=0;i<n;i++) {
            if (arr[res] == arr[i])
                count++;
        }
            if(count <= n/2){
                res = -1;
            }

        return arr[res];

    }





    public static void main(String[] args) {
        // for a Majority Element it should comes n/2 times
        int arr[] = {8,7,6,8,6,8,8,8,8};
        int n= arr.length;
//        System.out.println(findMajorityElement(arr,n));
        System.out.println(findMajorityElementOptimize(arr,n));
    }
}
