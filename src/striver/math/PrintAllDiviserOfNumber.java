package striver.math;

public class PrintAllDiviserOfNumber {
    private static void print(int n){
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                System.out.print( i +" ");
            }
        }
    }


    private static void printDivisors(int n) {



        for (int i = 1; i * i <= n; i++) {

            if (n % i == 0) {

                System.out.print(i + " ");

                if ((n / i) != i) {
                    System.out.print((n / i) + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        print(36);
        System.out.println();
        printDivisors(36);
    }
}
