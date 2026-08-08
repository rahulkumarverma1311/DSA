package striver.pattern;

public class P11 {
    private static void printP11(int n){
        for(int i=0;i<n;i++){
            for(char ch ='A';ch <= 'A'+ (n - i -1 );ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
            printP11(5);
    }
}
