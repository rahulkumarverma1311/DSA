package striver.hashing;

import java.util.HashMap;
import java.util.Map;

public class CountDigitOccerence {
        private static void count(int n){
            Map<Integer,Integer> map = new HashMap<>();
            while (n > 0) {
                int digit = n % 10;

                map.put(digit, map.getOrDefault(digit, 0) + 1);

                n = n / 10;

            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                System.out.println(
                        entry.getKey() + " → " + entry.getValue()
                );
            }
        }
    public static void main(String[] args) {
        int n =1123444;
        count(n);
    }
}
