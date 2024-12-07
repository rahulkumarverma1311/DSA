package freshStart.mathematics;

public class PalindromeNumbers {
    private static int getPalindromeNumbers(int n){
        int res= 0;
        while (n>0){
            int reminder = n % 10;
            res = (res * 10) + reminder;
            n= n/10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getPalindromeNumbers(432));

    }
}
