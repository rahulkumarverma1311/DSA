package striver.Recursion;

public class PrintOneToNNonBackTracking {
    private static void printNumber(int i,int n){
        if (i > n) {
            return;
        }

        printNumber(i + 1, n);

        System.out.print(i + " ");
    }
    public static void main(String[] args) {
        printNumber(1,5);
    }
}
