package starPattern;

public class P3 {

    private static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j = n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int s=1;s<=i;s++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {

        pattern3(4);

    }
}
