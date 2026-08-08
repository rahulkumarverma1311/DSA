package striver.math;

public class CountDigits {


    private static int countDigits(int n){
//        int count=0;
//        while(n > 0){
//            count++;
//            n = n /10;
//        }
//        return count;

       return  (int)(Math.log10(n) +1);
    }
    public static void main(String[] args) {
        System.out.println(countDigits(35421));
    }
}
