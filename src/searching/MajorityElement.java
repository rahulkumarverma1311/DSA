package searching;

public class MajorityElement {
    private static int getMajorityElement(int arr[]){
        int count =0;
        if(arr.length ==1){
            return arr[0];
        }
        for(int i=0;i< arr.length -1; i++){
            for (int j = i+1; j< arr.length;j++){
                if(arr[i] ==  arr[j]){
                    count++;
                    if(count > (arr.length / 2)){
                        return arr[i];
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        int arr[] = {1, 1, 2, 1, 3, 5, 1};
        int arr[] = {2,13};
        System.out.println(getMajorityElement(arr));
    }
}
