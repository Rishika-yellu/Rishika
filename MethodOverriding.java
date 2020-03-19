
package mypro;

public class MethodOverriding {
    public static void main(String[] args) {
        Child obj=new Child();
        
        obj.sum();
    }
    
}
class Parent
{
    int a=3;
    int b=9;
    int c=4;
    public void sum()
    {
        System.out.println("a+b is"+a+b);
                
    }
}
class Child extends Parent
{
    public void sum()
    {
        System.out.println("b+c is"+b+c);
    }
}
