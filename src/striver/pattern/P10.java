package striver.pattern;

public class P10 {
    private static void printP10(int n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
            printP10(5);
    }
}
