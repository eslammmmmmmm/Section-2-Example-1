

package assigment.pkg2;


public class student extends person{
    status st;
    public  student(status st)
    {
      this.st=st;
    }
    @Override
   void tostring()
    {
          System.out.println("Class name is student\n");
          st.printStatus();
    }
    
}
