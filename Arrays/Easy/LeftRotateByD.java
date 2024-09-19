package Arrays.Easy;

import java.util.Arrays;

public class LeftRotateByD {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int D = 2;  // Number of positions to rotate

        leftRotate(arr, D);

        System.out.println("Array after left rotation by " + D + " elements:");
        System.out.println(Arrays.toString(arr));
    }

    // Method to rotate the array to the left by D elements
    private static void leftRotate(int[] arr, int D) {
        int n = arr.length;

        // If D is greater than array length, adjust it to be within bounds
        D = D % n;

        // Step 1: Reverse the first D elements
        reverseArray(arr, 0, D - 1);

        // Step 2: Reverse the remaining elements
        reverseArray(arr, D, n - 1);

        // Step 3: Reverse the entire array
        reverseArray(arr, 0, n - 1);
    }

    // Helper method to reverse elements in the array between two indices
    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
