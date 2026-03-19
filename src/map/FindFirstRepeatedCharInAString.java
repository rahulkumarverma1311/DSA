package map;

import java.util.HashMap;

public class FindFirstRepeatedCharInAString {
    private static String getRepeatedChar(String s){
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                return String.valueOf(c);
            }else {
                map.put(c,1);
            }
        }
        return "-1";
    }
    public static void main(String[] args) {
        String s = "ram";
        System.out.println(getRepeatedChar(s));
    }
}
