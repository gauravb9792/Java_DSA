package Arrays.Easy;

public class move_zero_to_end {
    public static void main(String[] args) {
        int arr[]={0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        movetoend(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    private static void movetoend(int[] arr) {
        int n=arr.length;
        int index=0;
        for (int i = 0; i <n; i++) {
            if(arr[i]!=0)
            {
               arr[index++] =arr[i];
            }

        }
        while (index < arr.length) {
            arr[index++] = 0;
        }


    }


}
