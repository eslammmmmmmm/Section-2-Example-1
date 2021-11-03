
package assigment.pkg2;


public class Staff extends Employee{
    public String title;

    public Staff(int office, double salary, Mydate mydate, String title) {
        super(office, salary, mydate);
        this.title=title;
    }
    @Override
     void tostring()
    {
   
        System.out.println("Class name is Staff ");
        System.out.println("Title  Staff is "+this.title+"\n");
        
    }
}
