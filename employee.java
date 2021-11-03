

package assigment.pkg2;

import java.util.Date;


public class Employee extends person {
   public int office;
   public double salary;
   public Mydate mydate;
   public Employee(int office,double salary,Mydate mydate)
    {
        this.office=office;
        this.salary=salary;
        this.mydate=mydate;
    }
   @Override
   void tostring()
    {
        System.out.println("Class name is Employee\n");
        System.out.println("Number Office is "+ this.office+"  Salary is "+this.salary+"\n");
        mydate.printDate();
    }
   
}
