/*c0mpany mangement */
class Employee
{
    int id;
    String name;
    double salary;

    Employee(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void calculateSalary()
    {
        System.out.println("Basic Salary:"+salary);
    }
}
class Manager extends Employee
{
    double bouns;
    int turm;

    Manager(int id,String name,double salary, double bouns, int turm)
    {
        super(id, name, salary);
        this.turm=turm;
        this.bouns=bouns;
    }
    void DisplaySalary()
    {
        super.calculateSalary();
        double Toatl =super.salary+this.bouns;

        System.out.println("Bouns:"+this.bouns);
        System.out.println("TOtal Salary:"+Toatl);
        System.out.println("TURM:"+turm);
    }
}
public class programm418 {

    public static void main(String[] args) {
        
        Manager mobj =new Manager(301, "patill", 48000, 4000, 10);

        mobj.calculateSalary();
    }
    
}
