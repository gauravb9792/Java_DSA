package Arrays.Easy;

import java.util.HashSet;
import java.util.Set;

public class union {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,6};
        int arr2[]={2,4,7,4,5,3,6};

        Set<Integer> unionset=new HashSet<>();
        for (int i = 0; i <arr1.length ; i++) {
            unionset.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            unionset.add(arr2[i]);
        }
        System.out.println("union of the numbers");
        for (int num:unionset) {
            System.out.print(num+" ");
            
        }

    }
}
