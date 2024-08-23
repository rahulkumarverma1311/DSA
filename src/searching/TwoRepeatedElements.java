package searching;

import java.util.Arrays;

public class TwoRepeatedElements {

    private static int[] twoRepeated(int n, int arr[]) {

        Arrays.sort(arr);
        int res[] = new int [n+2];
        int index=0;
        for(int i=1;i<=(n+2)+1;i++){
            if(arr[i] == arr[i-1] || arr[i]== arr[i+1]){
                res[index] =  arr[i];
                index++;
            }
        }
        return res;
    }



    public static void main(String[] args) {


        int arr[] = {1, 2, 1, 3, 4, 3};

        System.out.println(twoRepeated(4,arr));

    }
}
