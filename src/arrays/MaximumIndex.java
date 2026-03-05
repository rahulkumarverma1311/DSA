package arrays;

public class MaximumIndex {

   private static int optimalApproach(int arr[],int n){
       int ascOrder[] = new int [n];
       int descOrder[] = new int [n];
       ascOrder[0] = arr[0];
       descOrder[n-1] =  arr[n-1];
       for(int i= 1;i< n ; i++){
           ascOrder[i] = Math.min(arr[i],ascOrder[i-1]);
       }
       for(int i=n-2;i>-1;i--){
           descOrder[i] = Math.max(descOrder[i+1],arr[i]);
       }
       int i=0,j=0,ans=0;
       while (i < n && j < n){
           if(ascOrder[i] <= descOrder[j]){
               ans = Math.max(ans,j-i);
               j++;
           }else {
               i++;
           }
       }
       return ans;
   }

    private static int nativeApproach(int arr[],int n){
        int ans =0;
        for(int i=0;i< n ;i++){
            for(int j = n -1;j > i ;j--){
                if(arr[i] <= arr[j]){
                    ans = Math.max(ans, j-i);
                    break;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
       int arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        //int arr[] = {1,10};
        int n =arr.length;
        System.out.println(nativeApproach(arr,n));
        System.out.println(optimalApproach(arr,n));

    }
}
