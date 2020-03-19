
package mypro;

import java.util.Scanner;


public class Palindrome {
    public static void main(String args[])
    {
        int rem,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int original=n;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==original)
        System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
    
}
