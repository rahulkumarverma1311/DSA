package freshStart.Recursion;

public class InfiniteRecursion {

    private static void infinite(){
        System.out.println("Ram Ram");
        infinite();
    }

    public static void main(String[] args) {
        infinite();
    }
}
