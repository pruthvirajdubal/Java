class Employee
{
    void calculateSalary()
    {
        System.out.println("Employee salary calculation");
    }
}
class Developer extends Employee
{
    @Override
    void calculateSalary()
    {
        System.out.println("Developer salary+technical allowance");
    }
}
class Manager extends Employee
{
    @Override

    void calculateSalary()
    {
        System.out.println("manager salary+management bouns:");
    }
}
public class programm428 {
 public static void main(String[] args) {

    Employee mp;

    mp = new Developer();
    mp.calculateSalary();
    
    mp = new Manager();
    mp.calculateSalary();
 }   
}
