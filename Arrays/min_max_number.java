public class min_max_number {
    public static void main(String[] args) {
        int array[]={4,3,5,7,1,9,46};
        MIN_MAX( array);
    }
     static void MIN_MAX(int array[])
     {
        int  min=array[0];
         int max=array[0];

         for (int i = 1; i < array.length ; i++) {
             if(array[i]<min)
             {
                 min=array[i];
             }
             if(array[i]>max) {
                 max = array[i];
             }
         }
         System.out.println("max ="+max);
         System.out.println("min ="+min);
     }
}
