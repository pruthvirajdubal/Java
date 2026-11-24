import java.util.Scanner;

class Employee
{
    String name;
    String deprtment;
    double salary;
    int mo;
    String city;

Employee setName(String name)
{
    this.name=name;
    return this;
}
Employee setDepartment(String department)
{
    this.deprtment=department;
    return this;
}
Employee setSalary(double salary)
{
    this.salary=salary;
    return this;
}
Employee setMo(int mo)
{
    this.mo=mo;
    return this;
}
Employee setCity(String city)
{
    this.city=city;
    return this;
}
void dispaly()
{
    System.out.println("name:"+name);
    System.out.println("DEpatmrnt:"+deprtment);
    System.out.println("Salary:"+salary);
    System.out.println("MO"+mo);
    System.out.println("CITY:"+city);

}
 
}
public class programm402 {
    public static void main(String[] args) {

        Scanner sobj =new Scanner(System.in);

        System.out.println("name");
        String name =sobj.nextLine();

          System.out.println("Depatment");
        String depatment =sobj.nextLine();

          System.out.println("Salary");
        double salary =sobj.nextDouble();

          System.out.println("MO");
        String mo=sobj.nextLine();

          System.out.println("City");
        String city =sobj.nextLine();

        new Employee().setName(name).setDepartment(city).setSalary(salary).setMo(0).setCity(city).dispaly();


        
      

    }
    
}
