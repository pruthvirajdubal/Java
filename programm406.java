//E-commerse

class Product{
    int productid;
    String productName;
    double price;
    int quantity;

    Product(int productid,String productName,double price,int quantity)
    {
        this.productid=productid;
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
    }

    void Bill() {
        double Toatl =price *quantity;

        System.out.println("Product:"+productName);  
        System.out.println("Price"+price); 
         System.out.println("Quantity:"+quantity);  
         System.out.println("TOtal:"+Toatl);


    }

}
public class programm406 {

    public static void main(String[] args) {

        Product pobj =new Product(101, "leptop", 56000, 10);
        
        pobj.Bill();

    }
    
}
