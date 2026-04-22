package starPattern.patterns;

public class SolidSquarePattern {
    private static void printSolidPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printSolidPattern(5);
    }
}
