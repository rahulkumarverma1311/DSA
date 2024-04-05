public class Test {

    private static void star(int n){
        for(int i=1;i<=n;i++){
            for(int j=2;j<=n;j++){
                System.out.print(" ");
            }
           for(int star = 1;star<=i;star++){
               System.out.print(" * ");
           }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        star(5);

    }
}
