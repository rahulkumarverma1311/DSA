package searching;

public class RemoveDuplicatesfromSortedArray {
    private static int removeDuplicates(int[] arr) {
        int n = arr.length;
        int i=0;
        while(i< arr.length){
            int element = arr[i];
            int idex = i;
            int count = 0;
            while (((idex < arr.length) && element == arr[idex])) {
                count++;
                idex++;
            }
            if(count>2){
                n = n -(count-2);
                    for (int j = i + 2; j < (i+count) && idex<arr.length; j++,idex++) {
                        arr[j] = arr[idex];
                        arr[idex] =arr[idex+1]; 
                    }
            }
            i += count;
        }
        return n;

////      for(int i=0;i<arr.length;i++) {
//          int element = arr[i];
//          int idex = i;
//          int count = 0;
//              while (((idex < arr.length) && element == arr[idex])) {
//                  count++;
//                  idex++;
//              }
////
////          }




    }

    public static void main(String[] args) {
       // int arr[]= {1,1,1,2,2,3};
        int arr[]= {0,0,1,1,1,1,2,3,3};

        System.out.println(removeDuplicates(arr));


    }
}
