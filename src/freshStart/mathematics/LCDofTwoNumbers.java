package freshStart.mathematics;

public class LCDofTwoNumbers {

    private static int getLCD(int n1,int n2){
        int res = 1;
        for (int i = 2;i<= Math.min(n1,n2); i++){
            if((n1 % i == 0) && (n2%i==0))
                return i;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("get LCD of two number's by my method :- "+ getLCD(4,6));
    }


}
