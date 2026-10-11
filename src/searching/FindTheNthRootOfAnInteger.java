package searching;

public class FindTheNthRootOfAnInteger {
    private static int findNthRoot(int n,int m){
        int low =1;
        int high =n;
        while(low <= high){
            int mid = low + (high - low)/2;
            int mul =(int ) multiply(m,mid);
            if (mul== n){
                return mid;
            }else if(mul < n){
                low = mid +1;
            }else{
                high = mid -1;
            }

        }
    return -1;
    }


    private static long  multiply(int n,int m){
        long  ans = 1;
        for(int i=1;i<=m;i++){
            ans = ans * n;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n =5;
//        System.out.println(multiply(2,5));

        System.out.println(findNthRoot(27,3));
    }
}
