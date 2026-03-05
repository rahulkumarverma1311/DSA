package arrays;

import java.util.HashSet;

public class LongestCommonPrefix {
    private static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        String minString = strs[0];
        for(int i=1;i< strs.length;i++){
            if(strs[i].length() < minString.length())
                minString = strs[i];
        }
        HashSet<String> prefixSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i< minString.length();i++){
            sb.append(minString.charAt(i));
            prefixSet.add(sb.toString());
        }
        for(int i=0;i< strs.length;i++){
            if(strs[i].equals(minString))
                continue;
            HashSet<String> tempSet = new HashSet<>();
            StringBuilder tempSb = new StringBuilder();
            for(int j = 0;j< strs[i].length();j++){
                tempSb.append(strs[i].charAt(j));
                String currPrefix = tempSb.toString();
                if(prefixSet.contains(currPrefix)){
                    tempSet.add(currPrefix);
                }else{
                    break;
                }
            }
            prefixSet = tempSet;
            if(prefixSet.isEmpty()) break;
        }
        String res ="";
        for(String s : prefixSet){
            if(s.length() > res.length()){
                res = s;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String [] s = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(s));
    }
}
