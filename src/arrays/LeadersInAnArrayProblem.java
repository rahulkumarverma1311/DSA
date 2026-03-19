package arrays;

public class LeadersInAnArrayProblem {


    private static void getLeadersNaive(int arr[],int n){
        for(int i=0;i< n;i++){
            boolean flag = false;
            for(int j = i +1;j<n;j++){
                if(arr[i] <= arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag==false)
                System.out.print(arr[i]+ " ");
        }
    }

    private static void getLeaderOptimize(int arr[],int n){
        int currentLeader = arr[n-1];
        System.out.print(currentLeader + " ");
        for(int i=n-2;i>=0;i--){
            if(arr[i] > currentLeader){
                currentLeader = arr[i];
                System.out.print(currentLeader + " ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,10,4,10,6,5,2};
        int n = arr.length;
//        getLeadersNaive(arr,n);
        getLeaderOptimize(arr,n);
    }

}
