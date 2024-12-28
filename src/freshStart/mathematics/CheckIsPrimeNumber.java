package freshStart.mathematics;

public class CheckIsPrimeNumber {

    private static boolean isPrimeNaive(int n){

        for(int i=2;i<n;i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println("check is prime with naive method:-"+ isPrimeNaive(7));

    }
}
