package starPattern;

public class Pattern4 {

    private static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n -i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {

        pattern(5);

    }
}
