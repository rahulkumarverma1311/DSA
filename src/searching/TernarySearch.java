package searching;

/*
Ternary Search is a Divide and Conquer Algorithm used to perform search operation in a sorted array. This algorithm is similar to the Binary Search algorithm but rather than dividing the array into two parts, it divides the array into three equal parts.

In this algorithm, the given array is divided into three parts and the key (element to be searched) is compared to find the part in which it lies and that part is further divided into three parts.

We can divide the array into three parts by taking mid1 and mid2 which can be calculated as shown below. Initially, l and r will be equal to 0 and N-1 respectively, where N is the length of the array.

mid1 = l + (r-l)/3
mid2 = r – (r-l)/3





Note: The array must be sorted in order to perform the Binary Search or Ternary Search operation.

Steps to perform Ternary Search:
First, we compare the key with the element at mid1. If found equal, we return mid1.
If not, then we compare the key with the element at mid2. If found equal, we return mid2.
If not, then we check whether the key is less than the element at mid1. If yes, then recur to the first part.
If not, then we check whether the key is greater than the element at mid2. If yes, then recur to the third part.
If not, then we recur to the second (middle) part.


Implementation: The Ternary Search Algorithm can be implemented in both recursive and iterative manner. Below is the implementation of both recursive and iterative function to perform Ternary Search on an array arr[] of size N to search an element key.

 */
public class TernarySearch {

    private static int search(int arr[], int element) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;
            if (element == arr[mid1]) {
                return mid1;
            }
            if (element == arr[mid2]) {
                return mid2;
            }
            if (element < arr[mid1]) {
                high = mid1 - 1;
            } else if (element > arr[mid2]) {
                low = mid2 + 1;
            } else {
                low = mid1 + 1;
                high = mid2 - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(search(arr,5));
    }
}
