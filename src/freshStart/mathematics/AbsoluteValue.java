package freshStart.mathematics;

public class AbsoluteValue {
    private static int getAbsoluteValueShortCut(int n){
        return Math.abs(n);
    }
    private static int getAbsoluteValue(int n){
        if(n >=0)
            return n;
        else
            return  n - (2 * n);

    }
    public static void main(String[] args) {
        System.out.println(getAbsoluteValue(-1311));
    }
}
