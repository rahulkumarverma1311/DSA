package striver.Recursion;

public class PrintNameNTime {

    private static void printName(int n){
        if(n == 0)
            return ;
        System.out.println("Rahul");
        printName(n -1);
    }
    public static void main(String[] args) {
        printName(5);
    }
}
