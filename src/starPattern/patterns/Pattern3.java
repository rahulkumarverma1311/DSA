package starPattern.patterns;

public class Pattern3 {
    private static void patternPrint(){
        int n=5;
        for(int row =1;row<=n;row++){
            for(int space =1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int star =1;star<=n;star++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patternPrint();
    }
}
