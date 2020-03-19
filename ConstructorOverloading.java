
package mypro;

public class ConstructorOverloading {
        public static void main(String args[])
{
Ab obj=new Ab(5);
}
}
class Ab{
    public Ab()
    {
        System.out.println("constructor");
    }
    public Ab(int i)
    {
        System.out.println("paramerized constructor");
    }
}
