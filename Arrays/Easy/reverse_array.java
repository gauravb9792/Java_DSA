package Arrays.Easy;

public class reverse_array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int n= arr.length;
        for (int i = 0; i <n/2; i++) {
            int temp;
            temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }

        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
