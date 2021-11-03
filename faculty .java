
package assigment.pkg2;


public class faculty extends Employee{
    public int OfficeHoure;
    public String rank;
      
    public faculty(int office, double salary, Mydate mydate,int OfficeHoure,String rank) {
        
        super(office, salary, mydate);
        this.OfficeHoure=OfficeHoure;
        this.rank=rank;
    }

    @Override
     void tostring()
    {
        super.tostring();
        System.out.println("Class name is Faculty\n");
        System.out.println("Office Houre is "+this.OfficeHoure+"Rank is "+this.rank);
        
    }
    
}
