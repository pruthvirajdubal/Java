
class Employee{

    String name;
    double salary;

    Employee(String name,double salary)
    {
        this.name=name;
        this.salary=salary;
    }
    void DisplayEmployee()
    {
        System.out.println("NAME:"+name);
        System.out.println("Salary:"+salary);
    }
}

class Developer extends Employee
{
    String name;
    String language;

    Developer(String name,double salary,String language)
    {
        super(name, salary);
        this.name=name;
        this.language=language;
    }

    void DiaplayDeveloper()
    {
        super.DisplayEmployee();

        System.out.println("Developer name:"+this.name);
        System.out.println("Language :"+this.language);
    }
}
public class programm414 {

    public static void main(String[] args) {

        Developer dobj =new Developer("pruthvi", 82000, "java");

        dobj.DiaplayDeveloper();
        

    }
    
}
