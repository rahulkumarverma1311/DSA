package freshStart.mathematics;

public class TrailingZerosInFactorial {

    private static int getTrailingZeroInFactorialNAive(int n){

        int fac=1;
        for(int i=2;i<=n;i++){
            fac = fac*i;
        }
        int res=0;
        while (fac % 10 ==0){
            res++;
            fac = fac/10;
        }
        return res;
    }
/***
    1) Naive Approach
    A simple method is to first calculate the factorial of n, then count trailing 0s in the result (We can count trailing 0s by repeatedly dividing the factorial by 10 till the remainder is not 0).

    But, this method can cause overflow for slightly bigger numbers as the factorial of a number is a big number. So, we prefer the Efficient Approach

2) Efficient Approach
    The idea is to consider prime factors of a factorial n. A trailing zero is always produced by prime factors 2 and 5. Our task is done if we can count the number of 5s and 2s. Consider the following examples:

    n = 5: There is one 5 and 3 2s in prime factors of 5! (2 * 2 * 2 * 3 * 5). So a count of trailing 0s is 1.
    n = 11: There are two 5s and eight 2s in prime factors of 11! (28 * 34 * 52 * 7 * 11). So the count of trailing 0s is 2.
    We can easily observe that the number of 2s in prime factors is always more than or equal to the number of 5s. So if we count 5s in prime factors, we are done.

    Following is the summarized formula for counting trailing 0s:

    Trailing 0s in n! = Count of 5s in prime factors of n! = floor(n/5) + floor(n/25) + floor(n/125) + ....
****/
    private static int getTrailingZeroInFactorial(int n){
        int res=0;
        for(int i=5;i<=n; i = i * 5){
            res = res + (n / i);
        }
        return res;
    }

    public static void main(String[] args) {
//        System.out.println("naive solution:-"+ getTrailingZeroInFactorialNAive(10));
        System.out.println("optimal solution:-"+ getTrailingZeroInFactorial(125));

    }
}
