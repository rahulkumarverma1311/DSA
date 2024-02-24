package starPattern;

public class P4 {

    private static void pattern(int n){
        for(int i=1;i<n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int s1=1;s1<=i;s1++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=2;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=n;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        pattern(5);

    }
}
