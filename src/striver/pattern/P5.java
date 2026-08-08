package striver.pattern;

public class P5 {

    private static void printP5(int n){
        for(int i=1;i<= n;i++){
            for(int j = 0;j < (n -i) +1 ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printP5(6);
    }
}
