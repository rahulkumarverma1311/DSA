package arrays;

public class PrintNthRowOfPascalTriangle {
    private static void printRowOfPascalTriangle(int n){
        int ans =1;
        System.out.print(ans +" ");
        for(int i=1;i<n;i++){
            ans = ans * (n - i);
            ans = ans / i;
            System.out.print(ans+ " ");
        }
    }
    private static void printRowOfPascalleetcode(int n){
        int ans =1;
        System.out.print(ans +" ");
        for(int i=1;i<n;i++){
            ans = ans * (n - i+1);
            ans = ans / i;
            System.out.print(ans+ " ");
        }
    }
    public static void main(String[] args) {
        printRowOfPascalTriangle(5);
    }
}
