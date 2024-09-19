package Arrays.Easy;

public class duplicate_from_sorted_array {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,3,4,4,4,5,5};
        int length=duplicate_from_sorted(arr);
        for (int i = 0; i < length ; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    private static int duplicate_from_sorted(int[] arr) {
        if(arr.length==0)
            return 0;
        int index=1;
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]!=arr[i-1])
            {
                arr[index++]=arr[i];
            }
        }
        return index;
    }
}
