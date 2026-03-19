package arrays;

public class FrequenciesInSortedArray {
    private static void getFrequencies(int arr[]){
        int n =arr.length;
        int fre =1;
        int i=1;
        while (i < n){
            while (i< n && arr[i -1] == arr[i]){
                fre++;
                i++;
            }
            System.out.print(arr[i-1] + " frequencies :" + fre+", ");
            i++;
            fre=1;
        }
        if(n == 1 || arr[n-1] != arr[n-2]){
            System.out.println(arr[n-1] + " frequencies :"+ 1+ ", ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        getFrequencies(arr);
    }
}
