package string;



public class ReverseString {

    private static void reverse(String s){
       String rs ="";
       int index = s.length() -1;
       while (index >=0){
           rs = rs + s.charAt(index);
           index--;
       }
        System.out.println(rs);
    }
    public static void main(String[] args) {
        reverse("ram");

    }
}
