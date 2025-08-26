package sorting;

public class MergeFunctionMergeSort {
    private static void merge(int arr[], int low, int mid, int high) {
        int n1 = (mid - low) + 1;
        int n2 = high - mid;
        int a1[] = new int[n1];
        int a2[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            a1[i] = arr[low + i];
        }
        for (int j = 0; j < n2; j++) {
            a2[j] = arr[mid + j + 1];
        }
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (a1[i] <= a2[j]) {
                arr[k] = a1[i];
                i++;
                k++;
            } else {
                arr[k] = a2[j];
                j++;
                k++;
            }
        }
        while(i < n1){
            arr[k] = a1[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = a2[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int a[] = new int[]{10,15,20,40,8,11,15,22,25};
        int l=0,h=8,m=3;
        merge(a,l,m,h);
        for(int x: a)
            System.out.print(x+" ");
    }
}
