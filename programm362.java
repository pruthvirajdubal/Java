class Car
/*class object */
{
    String Brand;
    String model;
    int year;
    int Expier;
    double price;
    double milege;
    double Discount;
    String manufacturing;
    

void DisplayDetaile()
{
    System.out.println("Brand:"+Brand);
    System.out.println("MODEL:"+model);
    System.out.println("Year:"+year);
    System.out.println("Exppire"+Expier);
    System.out.println("Price:"+price);
    System.out.println("mileg:"+milege);
    System.out.println("Discount:"+Discount);

   }

}
public class programm362 {

    public static void main(String[] args) {
 
        Car cobj =new Car();
        cobj.Brand="TOYOTA";
        cobj.model="HYRYDER";
        cobj.year=2026;
        cobj.price=1700000;
        cobj.milege=27;
        cobj.Discount=10;

        cobj.DisplayDetaile();
    }
    
}
