package striver.hashing;

public class CountCharInString {

    private static void countChar(String s){
        int arr[] = new int[256];
        for(int i=0;i< s.length();i++){
            arr[s.charAt(i)]++;
        }

        for(int i : arr){
            System.out.print( i +" ");
        }
    }
    public static void main(String[] args) {

        String s = "madam";
        countChar(s);

    }
}
