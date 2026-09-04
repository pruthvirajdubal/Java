
class Employee
{
    int Id;
    String Name;
    double salary;
    String Depetment;

    void Display()
    {
        System.out.println(Id+" "+Name+" "+salary+" "+Depetment);
    }
}
public class programm358 {

  public static void main(String[] args) {
        
    Employee eobj= new Employee();
    eobj.Id=101;
    eobj.Name="aba";
    eobj.salary=45000;
    eobj.Depetment="IT";

    eobj.Display();
  
       
    }
    
}
