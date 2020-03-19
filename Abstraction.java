
package mypro;


public class Abstraction {
    public static void main(String args[])
    {
        Phone obj=new Newphone();
        obj.call();
        obj.move();
        obj.cook();
        obj.dance();
    }
    
}
abstract class Phone
{
public void call()
{
    System.out.println("calling..");
}
abstract public void move();
abstract public void dance();
abstract public void cook();

}
class Newphone extends Phone
{
    public void move()
    {
        System.out.println("moving");
    }
    public void dance()
    {
        System.out.println("dancing");
    }
    public void cook()
    {
        System.out.println("cooking");
    }
}