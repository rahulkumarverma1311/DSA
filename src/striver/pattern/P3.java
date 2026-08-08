package striver.pattern;

public class P3 {

    private static void printP3(int n){
        for(int i =1;i<= n ;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void printP4(int n){
        for(int i =1;i<= n ;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printP3(5);
        printP4(5);
    }
}
