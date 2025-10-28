package arrays;

public class StockBuyAndSellProblem {
    private static int maxProfit(int arr[], int start, int end) {
        if (end <= start) {
            return 0;
        }
        int profit = 0;
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (arr[j] > arr[i]) {
                    int currentProfit = arr[j] - arr[i]
                            + maxProfit(arr, start, i - 1)
                            + maxProfit(arr, j + 1, end);
                    profit = Math.max(profit, currentProfit);
                }

            }
        }
        return profit;
    }

    private static int maxProfitTwo(int arr[]){
        int profit =0;
        for(int i=1;i< arr.length;i++){
            if(arr[i] > arr[i-1]){
                profit +=  arr[i] -  arr[i-1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 8, 12};
        System.out.println(maxProfit(arr, 0, arr.length - 1));
        System.out.println(maxProfitTwo(arr));
    }
}
