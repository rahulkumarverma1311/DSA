package starPattern;

public class P1 {


    /*
        *
        * *
        * * *
        * * * *
        * * * * *
     */

    private static void p1Pattern(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int n =6;
        p1Pattern(n);

    }
}
