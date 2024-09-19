package Arrays.Easy;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("enter the number =");
       int  n=sc.nextInt();
       int arr[]= new int[n];

        System.out.println("enter the array=");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();

        }
        System.out.println("enter the number you want to search=");
        int num=sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num)
            {
                count++;
            }
        }

        if(count>0)
        {
            System.out.println("number exit");
        }
        else System.out.println("not EXIST");
    }
}
