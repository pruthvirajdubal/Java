class order 
{
    int orderid;
    String customername;
    double amount;
    String status;
}

public class programm388 {

    public static void main(String[] args) {

        order obj =new order();
        obj.orderid=100001;
        obj.customername="java dev";
        obj.amount=400000;
        obj.status="yes";

        System.out.println("OrderID :"+obj.orderid);
        System.out.println("Custmoername :"+obj.customername);
        System.out.println("AMOUNT :"+obj.status);
        
    }
    
}
