package starPattern;

public class P5 {


    private static void pattern(int n ){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        pattern(5);

    }
}
