class Product
{
    int product;
    String productName;
    int productID;
    double price;
    int quantity;
    String productBrand;

    void CalculateBill()
    {
        System.out.println("Product:"+product);
        System.out.println("ProductID:"+productID);
        System.out.println("Productname:"+productName);
        System.out.println("Price"+price);
        System.out.println("Quality:"+quantity);
        System.out.println("ProductBrand:"+productBrand);
    }
}

public class programm361 {

    public static void main(String[] args) {
        Product pobj =new Product();
        pobj.product=100;
        pobj.productID=1;
        pobj.productName="Apple";
        pobj.price=20000;
        pobj.quantity=20;
        pobj.productBrand="META";

        pobj.CalculateBill();
        
    }
    
}
