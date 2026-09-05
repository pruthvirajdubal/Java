class Employee
{
    int id;
    String name;
    double salary;
    int Projectcomplet;
    double rating;

    void performs()
    {
        System.out.println("NAME:"+name);
        System.out.println("Projectcomplet:"+Projectcomplet);
        System.out.println("RATING:"+rating);

        if(rating >=4.5 && Projectcomplet >=5)
        {
            System.out.println("Perfprm Exllent:");
            System.out.println("Bouns:10%");
        }
        else if(rating >=3.5 && Projectcomplet>=3)
        {
            System.out.println("Perform: Good");
            System.out.println("Bouns:10%");
        }
        else 
        {
            System.out.println("Performs Avrage:");
            System.out.println("Bouns:5%");
        }
    }
}

public class programm364 {
    public static void main(String[] args) {

        Employee eobj =new Employee();

        eobj.id=10;
        eobj.name="PATIL";
        eobj.salary=56000;
        eobj.Projectcomplet=5;
        eobj.rating=4.7;

        eobj.performs();
        

    }
    
}
