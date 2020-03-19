
package mypro;


public class SingleInheritance {
    public static void main(String[] args) {
        Sub obj=new Sub();
        obj.n1=1;
        obj.n2=6;
        obj.sum();
        System.out.println(obj.result);
        obj.sub();
        System.out.println(obj.result);
        
    }
    
}
class Add
{
    int n1,n2,result;
    public void sum()
    {
      result=n1+n2;  
    }
}
class Sub extends Add
{
    
    public void sub()
    {
        result=n2-n1;
    }
}
