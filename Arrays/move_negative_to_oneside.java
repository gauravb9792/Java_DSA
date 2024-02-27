import java.util.Arrays;

public class move_negative_to_oneside {
    public static void main(String[] args) {
        int array[]={-1,2,-3,5,7,-6,1};
        int left=0; int right= array.length-1;
        while (left<right)
        {
            while (array[left]<0)left++;
            while (array[right]>0)right--;
            if(left>=right)break;

            int temp=array[left];
            array[left]=array[right];
            array[right]=temp;

        }
        System.out.println(Arrays.toString(array));
    }
}
