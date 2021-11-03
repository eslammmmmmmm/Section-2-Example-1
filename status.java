
package assigment.pkg2;

final public class status {
    String sort,level,department;
    public status()
    {
     
        this.sort="freshman";
        this.level="sophomore";
        this.department="junior";
    }
    public void printStatus()
    {
        System.out.println("Sort is "+this.sort+"  level is "+this.level+"  Department is "+this.department);
    }
    
}
