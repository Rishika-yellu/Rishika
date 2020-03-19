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
public class Encapsulation {
    public static void main(String[] args) {
        
        Emp e1= new Emp();
        e1.setEmpId(3);
        e1.setEmpName("Rishi");
        //Emp e2= new Emp();
        //e2.empId=5;
        //Emp e3= new Emp();
        System.out.println(e1.getEmpId());
        System.out.println(e1.getEmpName());
    }
    
}
class Emp
{
    private int empId;
    private String empName;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
    
    
}
