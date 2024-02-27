public class cyclically_rotate_by_k {
    public static void main(String[] args) {
        int array[]={1,2,4,5,7,6};
        int n= array.length;
        int K=3;
        rotate(array,n,K);

    }
    static  void  rotate(int array[], int n, int k)
    {
        k=k%n;
        for (int i = 0; i < n; i++) {
            if(i<k)
            {
                System.out.print(array[n+i-k]+" ");
            }
            else {
                System.out.print(array[i-k]+ " ");
            }
        }
        System.out.println();
    }
}
