import java.util.Arrays;

public class Kth_min_element {
    public static void main(String[] args) {
        int array[]={1,2,9,3,5,6,8};
        int k=4;
        Arrays.sort(array);

        System.out.println(array[k-1]);
    }
}
