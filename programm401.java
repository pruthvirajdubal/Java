import java.util.Scanner;
//E commers order formaat
class Order{

    String product;
    int quatity;
    double price;

    Order setproduct(String product)
    {
        this.product=product;
        return this;
    }
    Order setQuantity(int quatity)
    {
        this.quatity=quatity;
        return this;
    }
    Order setprice(double price)
    {
        this.price=price;
        return this;
    }
    void calculateBill()
    {
        double Total =quatity *price;

        System.out.println("Product:"+product);
        System.out.println("Quantity:"+quatity);
        System.out.println("Toatl:"+Total);
    }
}

public class programm401 {

    public static void main(String[] args) {
        

    Scanner sobj =new Scanner(System.in);

    System.out.print("Product:");
    String product =sobj.nextLine();

    System.out.println("Quantity:");
    int quatity=sobj.nextInt();

    System.out.println("Pice:");
    double price =sobj.nextDouble();

    new Order().setproduct(product).setQuantity(quatity).setprice(price).calculateBill();

    }
    
}
