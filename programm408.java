//one class in creted multiple constructor

class Employee{
    int id;
    String name;
    double salary;

    //constructor
    Employee()
    {
        id=0;
        name="Unknown";
        salary=0;
    }
    //comstructor
    Employee(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    // consturtor
    Employee(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=25000;
    }
    void dispaly(){
        System.out.println(id +" "+name +" "+ salary);
    }
}
public class programm408 {
    public static void main(String[] args) {
        
        Employee eobj =new Employee();

        Employee eobj1 = new Employee(101, "pruthvi");

        Employee eobj2 =new Employee(102, "prafull", 50000);

        eobj.dispaly();
        eobj1.dispaly();
        eobj2.dispaly();
    }
    
}
