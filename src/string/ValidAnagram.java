package string;

import java.util.HashMap;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.



Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false
 */
public class ValidAnagram {
    private static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i< s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i< t.length();i++){
            char ch  = t.charAt(i);
            if(!map.containsKey(ch) || map.get(ch) == 0){
                return false;
            }
            map.put(ch, map.get(ch) -1);
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "rat";
        String t ="car";
        System.out.println(isAnagram(s,t));
    }

}
