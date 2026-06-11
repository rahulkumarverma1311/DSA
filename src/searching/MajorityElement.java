package searching;

public class MajorityElement {
    private static int getMajorityElement(int arr[]) {
        int count = 0;
        if (arr.length == 1) {
            return arr[0];
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    if (count > (arr.length / 2)) {
                        return arr[i];
                    }
                }
            }
        }
        return -1;
    }

    private static int majorityElement(int arr[]) {
        // code here
            int element = 0;
            int n = arr.length;
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (count == 0) {
                    count++;
                    element = arr[i];
                } else if (element == arr[i]) {
                    count++;
                } else {
                    count--;
                }
            }
            count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == element)
                    count++;
            }
            if (count > (n / 2)) {
                return element;
            }
            return -1;
    }

    public static void main(String[] args) {
//        int arr[] = {1, 1, 2, 1, 3, 5, 1};
        int arr[] = {2, 13};
        System.out.println(getMajorityElement(arr));
//        System.out.println(majorityElement(arr));
    }
}
