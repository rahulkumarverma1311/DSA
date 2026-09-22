package arrays;

public class SetMatrixZeroes {

    private static void setMatrix(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 0) {
                    markrow(arr, i);
                    markCol(arr, j);
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }


    }

    private static void markrow(int arr[][], int i) {
        for (int j = 0; j < arr[0].length; j++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }

    private static void markCol(int arr[][], int j) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }


    private static void setMatrixBetter(int arr[][]) {
        int row[] = new int[arr.length];
        int col[] = new int[arr[0].length];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }


    }

    private static void setMatrixOptimal(int arr[][]) {
        int clo0 = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    if (j != 0)
                        arr[0][j] = 0;
                    else
                        clo0 = 0;
                }
            }
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                if(arr[i][j] != 0){
                    if(arr[0][j] == 0 || arr[i][0] ==0){
                        arr[i][j] = 0;
                    }
                }
            }
        }
        if(arr[0][0] ==0){
            for(int i=0;i< arr.length;i++){
                arr[0][i] =0;
            }
        }
        if(clo0 ==0){
            for(int i=0;i<arr[0].length;i++){
                arr[i][0] =0;
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };


//        setMatrix(matrix);
        setMatrixBetter(matrix);

//        setMatrixOptimal(matrix);
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
