
package mypro;

import java.util.Scanner;


public class FibonaciiSeries {
    public static void main(String args[])
    {
        int a=1;
        int b=1;
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
       for(int i=0;i<=n;i++)
       {
           c=a+b;
           System.out.print(" "+c);
           a=b;
           b=c;
       }
    
    
}
}
