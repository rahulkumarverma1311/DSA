package intreview;

import org.omg.PortableInterceptor.ServerRequestInfo;

public class ReverseWordsInAString {
    private static String reverseWords(String s) {
        String[] split = s.split(" ");
        String res = "";
        for (int i = split.length - 1; i >= 0; i--) {
            if (split[i].length() == 0)
                continue;
            if (res.length() == 0) {
                res += split[i];
            } else {
                res += " " + split[i];
            }
        }
        return res;
    }

    private static String optimalApproach(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].length() == 0)
                continue;
            if (sb.length() == 0)
                sb.append(arr[i]);
            else {
                sb.append(" ");
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }

    private static String moreOptimal(String s) {
        StringBuilder sb = new StringBuilder();
        int startIdx = s.length() - 1;
        while (startIdx >= 0) {
            while (startIdx >= 0 && s.charAt(startIdx) == ' ') {
                startIdx--;
            }
            if (startIdx <= 0) 
                break;
            int endIdx = startIdx;
            while (startIdx >= 0 && s.charAt(startIdx) != ' ') {
                startIdx--;
            }
            if(sb.length() ==0)
                sb.append(s.substring(startIdx+1,endIdx+1));
            else{
                sb.append(" ");
                sb.append(s.substring(startIdx+1,endIdx+1));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "  Rahul Kumar Verma";
        System.out.println(reverseWords(s));
        System.out.println(optimalApproach(s));
        System.out.println(moreOptimal(s));
    }
}
