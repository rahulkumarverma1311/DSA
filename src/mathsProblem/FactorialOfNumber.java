package mathsProblem;

public class FactorialOfNumber {

    private static int getFactorialOfNumberNaive(int n){
        int res =1;
        for(int i=2;i<=n;i++){
            res = res * i;
        }
        return  res;
    }
    private static int getFactorialOfNumberRecursive(int n){
        if(n==0)
            return 1;
        return n * getFactorialOfNumberRecursive(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(getFactorialOfNumberNaive(n));
        System.out.println(getFactorialOfNumberRecursive(n));
    }
}
