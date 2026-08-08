package striver.pattern;

public class P6 {
    private static void printP6(int n){
        for(int i =0;i<n;i++){
            for(int j=0;j<n-i -1 ;j++){
                System.out.print(" ");
            }
            for(int k=0;k< 2 * i +1;k++){
                System.out.print("*");
            }
            for(int j=0;j<n-i -1 ;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
            printP6(5);
    }
}
