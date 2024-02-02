package arrays;

public class SecondLargestElementArray {
    // naive approach
    private static int getMaximumElementIndex(int arr[],int n){
        int max =0 ;
        for(int i=1;i<n;i++){
            if(arr[i]> arr[i-1])
                max = i;
        }
        return max;
    }
    private static int getSecMax(int arr[],int n){
        int max = getMaximumElementIndex(arr,n);
        int secMax = -1;
        for(int i=0;i<n;i++){
            if(arr[i] != arr[max]){
                if(secMax == -1){
                    secMax = i;
                }else if(arr[i] >arr[secMax]){
                    secMax = i;
                }
            }
        }
        return secMax;

    }

    // optimal approach

    private static int getSecMaxOptimal(int arr[],int n){
        int largest =0;
        int secLargest = -1;
        for(int i=1;i<n;i++){
            if(arr[i] > arr[largest]){
                secLargest = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if(secLargest == -1 || arr[i] > arr[secLargest]){
                    secLargest = i;
                }

            }
         /*   else if (arr[i] < arr[largest] && arr[i] >  arr[secLargest]) {
                secLargest = i;

            } */
        }
        return secLargest;
    }
    private static int getSecLargestElement(int arr[],int n){
        int max  = Integer.MIN_VALUE;
        int secMax  = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i] > max){
                secMax = max;
                max= arr[i];
            }else if(arr[i] > secMax && arr[i] != max){
                secMax = arr[i];
            }
        }
        return secMax;
    }


    public static void main(String[] args) {
        int ar[] = {1,223,22,423,241};
        //System.out.println(getSecMax(ar,ar.length));
        //  optimal
        // System.out.println(getSecMaxOptimal(ar,ar.length));

        // another optimal and easy to understand
        System.out.println(getSecLargestElement(ar,ar.length));

    }
}
