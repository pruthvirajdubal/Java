class Employee
{
    int id;
    String name;
    double salary;
}

public class programm381 {

    public static void main(String[] args) {
        
        Employee eobj =new Employee();
        eobj.id=101;
        eobj.name="raj";
        eobj.salary=39000;

        System.out.println("ID :"+eobj.id);
        System.out.println("NAME:"+eobj.name);
        System.out.println("SALARY :"+eobj.salary);

    }
    
}
