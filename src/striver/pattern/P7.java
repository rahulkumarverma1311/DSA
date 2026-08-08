package striver.pattern;

public class P7 {
    private static void printP7(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s <= i; s++) {
                System.out.print(" ");
            }
            for (int j =0;j < 2*n -(2 *i) -1;j++) {
                System.out.print("*");
            }
            for (int s = 0; s <= i; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printP7(5);
    }
}
