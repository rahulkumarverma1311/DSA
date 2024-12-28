package freshStart.mathematics;

public class LcmOfTwoNumber {

    /***
     * LCM is greater or equal to largest number of given number so wee need to find the a number that divide both
     */

    private static int getLCM(int a,int b ){
        int res = Math.max(a,b);
        while (true){
            if(res % a==0 && res % b ==0) {
                return res;
            }
            res++;
        }
       // return  res;
    }

    public static void main(String[] args) {
        System.out.println("get LCM of two number :-" + getLCM(4,6));
    }

}
