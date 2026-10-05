package arrays;

public class PascalTriangleProblemOne {
    private static int getElement(int row,int col){
        return findNcr(row-1,col-1);

    }

    private static int findNcr(int n,int r){
        int res=1;
        for(int i=0;i<r;i++){
            res = res * (n -i);
            res = res / (i+1);
        }
        return res;
    }
    public static void main(String[] args) {

        System.out.println(getElement(5,3));

    }

}
