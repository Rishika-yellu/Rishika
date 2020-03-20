
package mypro;

public class String2 {
    

    public static void main(String[] args) {
        Student s= new Student(20,"Rishi");
        System.out.println(s);   
    }
}
class Student
{
    int rollno;
    String name;
    public Student(int rollno,String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
    public java.lang.String toString() {
        return "Student{" + "rollno=" + rollno + ", name=" + name + '}';
    } 
}
