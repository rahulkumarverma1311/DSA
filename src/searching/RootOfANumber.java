package searching;

public class RootOfANumber {

    private static int getRoot(int n){
        int low=1;
        int high = n;
        while(low <= high){
            int mid = low + (high - low)/2;
            if((long) mid * mid <= n){
                low = mid +1;
            }else {
                high = mid -1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        System.out.println(getRoot(25));
    }
}
