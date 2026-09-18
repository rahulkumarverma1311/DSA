package arrays;

public class BestTimeToBuyAndSellStock {
    private static int maxProfitOptimal(int arr[]){
        int min =arr[0];
        int maxProfit = 0;
        for(int i=0;i< arr.length;i++){
            int profit =  arr[i] -  min;
            maxProfit = Math.max(profit,maxProfit);
            min = Math.min(arr[i],min);
        }


        return maxProfit;
    }
    public static void main(String[] args) {

        int arr[] = {7,1,5,3,6,4};
        System.out.println(maxProfitOptimal(arr));

    }
}
