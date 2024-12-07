package freshStart.mathematics;

public class GCDandHCFOfTwoNumbers {

    private static int getGCD(int a,int b){
        int res = Math.min(a,b);
        while (res >0){
            if(a % res ==0 && b % res ==0){
                break;
            }
            res--;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getGCD(4,6));

    }
}
