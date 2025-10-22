package string;

public class FirstOccurence {
    private static int firstOccurence(String txt, String pat) {
        for (int i = 0; i < txt.length(); i++) {
            for (int j = i + 1; j < txt.length(); j++) {
                String sub = txt.substring(i,j);
                if (sub.equals(pat))
                    return i;
            }
        }
        return -1;
    }
    private static int firstOccOptimize(String txt,String pat){
        for(int i =0;i<= txt.length() - pat.length();i++){
            String sub =  txt.substring(i,i+pat.length());
            if(sub.equals(pat))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "GeeksForGeeks";
        String s2 = "G";
        System.out.println(firstOccurence(s, s2));
        System.out.println(firstOccurence(s, s2));
    }
}
