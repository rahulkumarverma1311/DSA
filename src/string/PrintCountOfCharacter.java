package string;

public class PrintCountOfCharacter {
    private static void printCountAndChar(String s){
        int arr[] = new int[26];
        for(int i=0;i< s.length();i++){
            arr[s.charAt(i) - 'a']++;
        }
        for(int j= 0;j<26;j++){
            if(arr[j] > 0){
                System.out.print(((char) (j + 'a') + ":" + arr[j])+" ");
            }
        }
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        printCountAndChar(s);
        System.out.println();
        String c= "ram";
        String c2 = c;
        c =  c + "sita";
        System.out.println(c);
        if(c == c2)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
