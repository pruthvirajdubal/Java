
class car 
{
    String brand;
    String model;
    double price;
}

public class programm384 {

    public static void main(String[] args) {
        
        car c= new car();
        c.brand="TOYOTA";
        c.model="INNOVA";
        c.price=4100000;

        System.out.println("BRAND :"+c.brand);
        System.out.println("MODEL :"+c.model);
        System.out.println("PRICE :"+c.price);
    }
}
