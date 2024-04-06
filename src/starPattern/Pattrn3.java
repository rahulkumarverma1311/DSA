package starPattern;

public class Pattrn3 {

    private static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            if(i==n){
                for(int a =1;a<=n;a++){
                    System.out.print("*  ");
                }
            }
        }
    }
    public static void main(String[] args) {
        pattern3(9);

    }
}
