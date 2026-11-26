// E-Commerce order system

import java.util.Scanner;

class Order{
    int orderid;
    String customername;
    String product;
    double price;
    int quantity;
    String paymentmode;

    Order(int orderid,String customername,String product,double price,int quantity,String paymentmethod)
    {
        this.orderid=orderid;
        this.customername=customername;
        this.product=product;
        this.price=price;
        this.quantity=quantity;
        this.paymentmode= paymentmode;
    }

    double calculateTotal()
    {
        return price * quantity;
    }

    void placeOrder()
    {
        double Toatl=calculateTotal();

        System.out.println("\n=======================ORDER DETILS======================");
        System.out.println("ORDERID:"+orderid);
        System.out.println("Customer:"+customername);
        System.out.println("Product:"+product);
        System.out.println("Price:"+price);
        System.out.println("QUantity:"+quantity);
        System.out.println("PAYMENT:"+paymentmode);
        System.out.println("TOTAL:"+Toatl);
        System.out.println("============================================================");

        if(paymentmode.equalsIgnoreCase("UPI") ||
            paymentmode.equalsIgnoreCase("CARD") ||
           paymentmode.equalsIgnoreCase("COD"))
           {
            System.out.println("ORDER CONFIRM");
           }
           else 
           {
            System.out.println("Invalid Payment mode:");
           }
    }
}
public class programm413 {

    public static void main(String[] args) {
        
        Scanner sobj =new Scanner(System.in);

        System.out.println("OrdrID:");
        int id =sobj.nextInt();

        System.out.println("Customre name::");
        String name =sobj.nextLine();

        System.out.println("Product:");
        String product  =sobj.nextLine();

        System.out.println("PRICE:");
        int price =sobj.nextInt();

        System.out.println("QUANTITY:");
        int quantity =sobj.nextInt();

        System.out.println("Payment MODE:");
        int Payment =sobj.nextInt();

        Order oobj =new Order(id, name, product, price, quantity, product);

        oobj.placeOrder();
    }
    
}
