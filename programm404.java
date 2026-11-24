//Employee
class Employee {
    int id;
    String name;
    String dep;
    double salary;

    Employee(int id, String name,String dep,double salary)
    {
        this.id=id;
        this.name=name;
        this.dep=dep;
        this.salary=salary;
    }

    void dispaly(){

        System.out.println("ID:"+id);
        System.out.println("NAme:"+name);
        System.out.println("DEp:"+dep);
        System.out.println("SALRY:"+salary);

        System.out.println("================================");
    }
}

public class programm404 {
    public static void main(String[] args) {
        Employee eobj =new Employee(101, "SOAM", "HR", 50000);

        eobj.dispaly();
        eobj.dispaly();
    }
    
}
