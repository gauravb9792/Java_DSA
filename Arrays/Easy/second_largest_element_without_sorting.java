package Arrays.Easy;

public class second_largest_element_without_sorting {
    public static void main(String[] args) {
        int arr[]={1,3,4,7,17,54,23,94,63};
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MAX_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>largest)
            {
                second_largest=largest;
                largest=arr[i];
            }
            else if(arr[i]>second_largest && arr[i]!=largest)
            {
                second_largest=arr[i];
            }
        }
        System.out.println(second_largest);
    }
}
