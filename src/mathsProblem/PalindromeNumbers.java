package mathsProblem;

public class PalindromeNumbers {

    private static boolean isPalindromeNumbers(int n){
        int temp =n;
        int res=0;
        while(n>0){
            int reminder = n % 10;
            res = (res * 10) + reminder;
            n = n/10;
        }
       return (res == temp);
    }
    public static void main(String[] args) {
        int n = 121;

        System.out.println(isPalindromeNumbers(n));
    }
}
