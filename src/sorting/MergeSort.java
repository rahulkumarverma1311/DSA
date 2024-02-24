package sorting;

import java.util.Arrays;

public class MergeSort {
    private static void mergeSortNaive(int a[],int n1,int b[],int n2){
        int temp[] = new int[n1+n2];
        for(int i=0;i<n1;i++){
            temp[i] = a[i];
        }
        for(int i=0;i<n2;i++){
            temp[n1 + i]= b[i];
        }
        Arrays.sort(temp);
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }

    }
    private static void mergeSort(int a[],int n1,int b[],int n2){
        int i=0,j=0;
        while (i<n1 && j<n2){
            if(a[i] <= b[j]){
                System.out.print(a[i]+" ");
                i++;
            }else{
                System.out.print(b[i]+" ");
                j++;
            }
        }
        while (i<n1){
            System.out.print(a[i]+" ");
            i++;
        }
        while(j<n2){
            System.out.print(b[j]+" ");
            j++;

        }
    }
    public static void main(String[] args) {

        int a[] = {10,20,50};
        int n1 = a.length;
        int b[] = {5,52,50};
        int n2 = b.length;

     //   mergeSortNaive(a,n1,b,n2);


        mergeSortNaive(a,n1,b,n2);


    }
}
