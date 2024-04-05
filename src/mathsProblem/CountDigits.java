package mathsProblem;

public class CountDigits {
    private static int getNumberOfDigitInNumber(int n){
        int count =0;

        if(n < 0){
            return -1;
        }
        while(n>0){

            n = n/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 1311;
        System.out.println(getNumberOfDigitInNumber(n));
    }
}
