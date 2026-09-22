package arrays;

public class RotateMatrixImageBy90Degrees {


    private static int [][] rotateImage(int arr[][]){
        int ans [][] = new int [arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length;j++){
                ans[j][arr.length - 1 -i] = arr[i][j];
            }
        }
        return ans;
    }


    private static void rotateImageOptimal(int arr[][]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j< n;j++){
                int temp = arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++){
            int start =0;
            int end = n-1;
            while(start< end){
                int temp  = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }

        }
    }
    public static void main(String[] args) {
        int ans[][] ={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};

//        int ans [][] = rotateImage(ans);
        rotateImageOptimal(ans);
        for(int i[] : ans){
            for(int el : i){
                System.out.print(el +" ");
            }
            System.out.println();
        }

    }
}
