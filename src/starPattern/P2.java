package starPattern;

public class P2 {

    /*
       * * * *
       * * *`
       * *
       *

     */


    private static void p2Pattren(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        p2Pattren(5);

    }
}
