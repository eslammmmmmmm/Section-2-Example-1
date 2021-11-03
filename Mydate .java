package assigment.pkg2;

public class Mydate {
    public  int year,month,day ;
    public Mydate(int year,int month,int day)
    {
        this.year=year;
        this.month=month;
        this.day=day;
    }
    void printDate()
    {
        System.out.println("Date Hiered is "+this.day+" / "+this.month+" / "+this.year);
    }
    
}