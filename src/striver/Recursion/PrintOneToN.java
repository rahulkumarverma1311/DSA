package striver.Recursion;

public class PrintOneToN {
    private static void printNumber(int n){
        if(n < 1){
            return;
        }
        printNumber(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
            printNumber(5);
    }
}
