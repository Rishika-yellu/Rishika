
package mypro;

import java.util.Scanner;


public class StringOperations {
    public static void main(String[] args) {
        String s1,s2,s3;
        Scanner sc=new Scanner(System.in);
                System.out.println("Enter 2 strings");
                s1=sc.nextLine();
                s2=sc.nextLine();
                int l1=s1.length();
                int l2=s2.length();
                System.out.println("string1 length= "+l1);
                System.out.println("string2 length= "+l2);
                s3=s1+s2;
                System.out.println("concatination result is "+s3);
                s1=s1.toUpperCase();
                System.out.println("1st string is "+s1);
                
    }
    
}
