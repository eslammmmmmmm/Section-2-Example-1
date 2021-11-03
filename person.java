
package assigment.pkg2;

public class person {
    public String name,address,PhNumber,emAddr  ;
  
    
    public person()
    {
        
    }
    public person(String name,String address,String PhNumber,String emAddr)
    {
        this.name=name;
        this.address=address;
        this.PhNumber=PhNumber;
        this.emAddr=emAddr;
       
    }
    void tostring()
    {
        System.out.println("Class name is Person\n");
        System.out.println("Name is "+ this.name+"  Address is "+this.address
               + "  Phone Number is "+ this.PhNumber+" Email Address is "+ this.emAddr+"\n");
        
    }
  
}
