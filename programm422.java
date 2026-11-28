class ProductService
{
    void product(String Productname)
    {
        System.out.println("product:"+Productname);
    }
    void product(String Productname,double mprice)
    {
        System.out.println("product:"+Productname+"below:"+mprice);
    }
    void product(String categary,String brand)
    {
        System.out.println("Categary:"+categary+"Brand:"+brand);
    }
}

public class programm422 {

    public static void main(String[] args) {

        ProductService pobj =new ProductService();

        pobj.product("LEPTOP");
        pobj.product("LEPTOP", 60000);
        pobj.product("dual", "Smasung");

    }
    
}
