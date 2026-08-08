package striver.pattern;

public class P8 {
    private static void printP8(int n){
        int space=2*(n-1);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            space=space-2;
            System.out.println();
        }
    }
    public static void main(String[] args) {
            printP8(4);
    }
}
