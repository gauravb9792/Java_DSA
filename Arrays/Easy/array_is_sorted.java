package Arrays.Easy;



public class array_is_sorted {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 2, 8, 5};

        if (is_sorted(arr)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }

    private static boolean is_sorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;  // If any element is greater than the next, array is not sorted
            }
        }
        return true;  // If all elements are in sorted order
    }
}
