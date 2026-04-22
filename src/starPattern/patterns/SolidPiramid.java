package starPattern.patterns;

public class SolidPiramid {
    private static void print() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            for (int i = 1; i <= 2 * row - 1; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print();
    }
}
