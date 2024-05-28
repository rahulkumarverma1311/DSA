package arrays;

public class FindTheAve {

    private static double ave(int numbers[],int n){
        double sum =0;
        int count=0;

        for(int i=0;i<n;i++){
            if(numbers[i]>= 0){
                sum = sum+ numbers[i];
                count++;
            }

        }
        return  sum / count;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
     //   System.out.println(ave(arr,n));

    }
}
