package freshStart.mathematics;

public class FactorialOfANumber {
    private static long getFactorial(int n){
        long res = 1;
        for (int i=2;i<=n;i++){
            res = res * i;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(getFactorial(7));

    }
}
