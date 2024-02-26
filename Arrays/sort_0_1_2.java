public class sort_0_1_2 {
    public static void main(String[] args) {
        int array[]={0,1,2,2,2,2,1,1,1,0,0,0,1};
        int zero=0; int one=0; int two=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==0)zero++;
            if(array[i]==1)one++;
            if(array[i]==2)two++;

        }
        for (int i = 0; i <zero ; i++)array[i]=0;
        for (int i = zero; i <one+zero ; i++)array[i]=1;
        for (int i = one+zero; i < array.length; i++)array[i]=2;

        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
