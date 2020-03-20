
package mypro;


public class StringMutable {
    

    public static void main(String[] args) {
    
        StringBuffer s=new StringBuffer("Hello");
        s.append(" @123");
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        
    }
    
}
