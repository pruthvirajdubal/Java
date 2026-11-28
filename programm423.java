class SalaryCalculate
{
    double salary(double basic)
    {
        return basic;
    }
    double salary (double basic ,double bouns)
    {
        return basic+bouns;
    }
    double salary(double basic,double bouns,double allowns)
    {
        return basic+bouns+allowns;
    }
}
public class programm423 {
    public static void main(String[] args) {
        
        SalaryCalculate scobj =new SalaryCalculate();

        System.out.println(scobj.salary(30000));
        System.out.println(scobj.salary(30000, 3000));
        System.out.println(scobj.salary(30000, 3000, 2000));

    }
    
}
