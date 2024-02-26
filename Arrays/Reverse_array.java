import java.util.Arrays;

public class Reverse_array {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5,6,9};
        reverseArray(array);
        System.out.print(Arrays.toString(array));
    }

        static void reverseArray(int array[])
        {
            for (int i = 0; i < array.length/2 ; i++) {
                int temp=array[i];
                array[i]=array[array.length-1-i];
                array[array.length-1-i]=temp;

            }
        }


    }

