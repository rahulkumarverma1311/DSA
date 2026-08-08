package striver.pattern;

import java.util.Scanner;

public class P2 {
    private static void printP2(int n){
        for(int i =0;i<n ;i++){
            for(int j =0;j<= i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i =0;i< count;i++) {
            int totalRow = sc.nextInt();

            printP2(totalRow);
        }
    }
}
