package starPattern;

public class Pattrn1 {

    private static void pattern(int n){
     /*   for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

      */
        int i=1;
        while(i<=n){
            int j=1;
            while (j<=n){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {

        pattern(5);

    }
}
