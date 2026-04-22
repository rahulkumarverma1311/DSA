package starPattern.patterns;

public class SolidRightAngleTriAngle {
    private static void printPattern(){
        int n=5;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
            printPattern();
    }
}
