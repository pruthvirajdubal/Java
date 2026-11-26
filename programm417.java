class product 
{
    int productid;
    String productname;
    double price;

    product( int productid,String productname ,double price)
    {
        this.productid=productid;
        this.productname=productname;
        this.price=price;
    }
    void DisplayProduct()
    {
        System.out.println("ID"+productid);
        System.out.println("PRoduct:"+productname);
        System.out.println("Price:"+price);
    }
}
class mobile extends product
{
    String productname;
    int Ram;
    mobile(int productid,String productname , double price,int Ram)
    {
        super(productid, productname, price);
        this.productname=productname;
        this.Ram=Ram;
    }
    void DisplayMobile()
    {
        super.DisplayProduct();
        System.out.println("Mobile name:"+this.productname);
        System.out.println("RAM:"+this.Ram+"GB");
    }
}

public class programm417 {
    public static void main(String[] args) {

        product pobj =new product(101, "samsung", 120000);

        pobj.DisplayProduct();
        

    }
    
}
