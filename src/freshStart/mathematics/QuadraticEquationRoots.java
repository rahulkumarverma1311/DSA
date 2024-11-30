package freshStart.mathematics;

import java.util.ArrayList;

public class QuadraticEquationRoots {
    private static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer>res = new ArrayList<>();
        double root = Math.pow(b,2) - (4 * a * c);
        if(root<0){
            res.add(-1);
            return res;
        }
        double x1 = (-b + Math.sqrt(root)) / (2* a);
        double x2 = (-b - Math.sqrt(root)) / (2 * a);
        x1 = Math.floor(x1);
        x2 = Math.floor(x2);
        res.add((int)Math.max(x1,x2));
        res.add((int)Math.min(x1,x2));
        return res;
    }
    public static void main(String[] args) {
        System.out.println(quadraticRoots(1,-7,12));
    }
}
