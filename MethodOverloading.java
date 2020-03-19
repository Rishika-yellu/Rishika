
package mypro;

public class MethodOverloading {
    public static void main(String[] args) {
        Area obj=new Area();
        obj.show();
    }
    
}
class Area
{
    public void show()
    {
        System.out.println("Hello");
    }
    public void show(int i)
    {
        System.out.println(i);
    }
}