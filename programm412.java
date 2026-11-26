// EMPloyee
class Employee {
    int id;
    String name;
    String dep;
    double salary;
    int experience;

    Employee( int id, String name,String dep,double salary,int experience)
    {
        this.id=id;
        this.name=name;
        this.dep=dep;
        this.salary=salary;
        this.experience=experience;
    }

    double Calculate(){

        if(experience >=5)
        {
            return salary * 0.20;
        }
        else if (experience >=3)
        {
            return salary * 0.10;
        }
        else 
        {
            return salary*0.05;
        }
}
    void dispalySalary()
    {
        double bouns =Calculate();
        double Finalsalary=salary +bouns;

        System.out.println("Employee:"+name);
        System.out.println("Expirence:"+experience);
        System.out.println("BOUNS:"+bouns);
        System.out.println("FInalSalary:"+Finalsalary);
    }
   
}   

public class programm412 {
    public static void main(String[] args) {

        Employee eobj =new Employee(101, "Ajikya", "IT", 127000, 4);
        
        eobj.dispalySalary();
    }
    
}
