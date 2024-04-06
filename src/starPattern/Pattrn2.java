package starPattern;

public class Pattrn2 {

    private static void pattrn(int n){
        for (int i=1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattrn(5);

    }
}
