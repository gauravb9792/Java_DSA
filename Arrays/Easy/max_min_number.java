package Arrays.Easy;

public class max_min_number {
    public static void main(String[] args) {
        int arr[]={2,5,3,8,1,9,4,100};

        int max=arr[0];
        int min=arr[0];

        for (int i = 1; i <arr.length ; i++) {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println(max);
        for (int i = 1; i <arr.length ; i++) {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
