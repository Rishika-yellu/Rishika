
package mypro;


public class CountOfObjects {
    public static void main(String[] args) {
        A ob1=new A();
        A ob2=new A();
        A ob3=new A();
        A ob4=new A();
        ob4.counter();
    }
    
}
class A
{
    static int i;
    public A()
    {
        i++;
    }
    public void counter()
    {
        System.out.println(i);
    }
}
