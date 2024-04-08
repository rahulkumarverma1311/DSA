package starPattern;

public class Pattern5 {

    private static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((j==0 || j== n-1) && (i==0 || i==n-1)){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        pattern(5);


    }
}
