package starPattern;

public class ReverseOfP3 {
    private static void pattern(int n){
        for(int i=1;i<=n;i++){

            for(int j=2;j<=i;j++){
                System.out.print(" ");
            }
            for(int s=n;s>=i;s--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        pattern(4);

    }
}
