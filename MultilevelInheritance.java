/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypro;

/**
 *
 * @author Moni
 */
public class MultilevelInheritance {
        public static void main(String[] args) {
        Mul obj=new Mul();
        obj.n1=1;
        obj.n2=6;
        obj.sum();
        System.out.println(obj.result);
        obj.sub();
        System.out.println(obj.result);
        obj.mul();
        System.out.println(obj.result);
        
    }
    
}
class Add1
{
    int n1,n2,result;
    public void sum()
    {
      result=n1+n2;  
    }
}
class Sub1 extends Add1
{
    
    public void sub()
    {
        result=n2-n1;
    }
}
class Mul extends Sub1
{
    
    public void mul()
    {
        result=n2*n1;
    }
}
    

