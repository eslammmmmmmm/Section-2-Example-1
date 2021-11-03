
package assigment.pkg2;


public class Assigment2 {

    
    public static void main(String[] args) {
        status stat =new status();
        Mydate dat=new Mydate(3,11,2021);
        person per =new person("Eslam","Minia","01014","ess@.com");
        student st=new student(stat);
        faculty fa=new faculty(16,3000,dat,12,"Programer");
        Staff staff=new Staff(16,3000,dat,"Egypt");
        
        per.tostring();
        System.out.println("**************");
        st.tostring();
        System.out.println("**************");
        fa.tostring();
        System.out.println("**************");
         staff.tostring();
    }
    
}
