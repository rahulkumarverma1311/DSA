package mathsProblem;

public class AbsoluteValue {
    private static int getAbsoluteValue(int n){
        if(n <0 )
            return n - ( n * 2);
        else
            return n;

    }

    public static void main(String[] args) {
        int n = -1311;
        System.out.println(getAbsoluteValue(n));
    }
}
