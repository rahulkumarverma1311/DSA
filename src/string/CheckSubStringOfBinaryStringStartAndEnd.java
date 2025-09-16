package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckSubStringOfBinaryStringStartAndEnd {
    private static int binarySubstring(String s) {
        int count = 0;
        List<String> set = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String subString = s.substring(i, j);
                if (subString.charAt(0) == '1' && subString.charAt(subString.length() - 1) == '1') {
                    set.add(subString);
                }

            }
        }
        return set.size();
    }

    private static int binary(String s){
        int count=0; for(int i = 0;i<s.length();i++){ if(s.charAt(i) == '1') count++; } return count * (count -1) /2;
    }

    public static void main(String[] args) {
        String s = "00011110";
        System.out.println(binarySubstring(s));
        System.out.println(binary(s));
    }
}
