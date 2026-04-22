package starPattern.patterns;

public class InvertedSolidRightAngleTriAngle {
    private static void printStar(){
        int n= 6;
        for(int row= 1;row<=n;row++){
            for(int col=1;col<= (n-row)+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printStar();
    }
}
