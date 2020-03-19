
package mypro;

import java.util.Scanner;


public class Armstrong {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int r,sum=0;
        int temp=n;
        while(n!=0)
        {
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        if(sum==temp)
            System.out.println("armstromg");
        else
            System.out.println("not armstromg");
            
    }
}
