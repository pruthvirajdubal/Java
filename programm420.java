class Product 
{
    String productname;
    double price;

    Product( String productname,double price)
    {
        this.productname=productname;
        this.price=price;

    }
    void producDetailes()
    {
        System.out.println("Product:"+productname);
        System.out.println("Price:"+price);
    }

}
class ElectronicProduct extends Product 
{
    String brand;

    ElectronicProduct( String productname,double price,String brand)
    {
        super(productname, price);
        this.brand=brand;
    }
    void brandDetailes()
    {
        System.out.println("Brand:"+brand);
    }
}
 class Leptop extends ElectronicProduct
 {
    int ram;

    Leptop( String productname,double price,String brand,int ram)
    {
        super(productname, price, brand);
        this.ram=ram;
    }
    void LeptopDetailes()
    {
        System.out.println("RAM:"+ram+"GB");
    }2
 }
public class programm420 {

    public static void main(String[] args) {

        Leptop lobj = new Leptop("mac", 230000, "os", 16);

        lobj.producDetailes();
        lobj.brandDetailes();
        lobj.LeptopDetailes();
        

    }
    
}
