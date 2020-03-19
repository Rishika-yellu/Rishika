
package mypro;

import java.util.Random;


public class Array {
    public static void main(String args[])
    {
        Random r=new Random();
        int a[]=new int[5];
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt(10);
        }
        for(int i:a)
            System.out.print(" "+i);
            
    }
    
}
