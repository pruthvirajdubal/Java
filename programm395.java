class Product 
{
    static double CalculateBill(

                    String productName,
                    int productId,
                    double price,
                    int quantity,
                    double discount
    )
    {

    double Total =price *quantity;

    double discountamount =Total *discount /100;

    double finalAmount =Total -discountamount;

    System.out.println("PRODUCT :"+productName);
    System.out.println("PRODUCTID :"+productId);
    System.out.println("Price :"+price);
    System.out.println("Quantity :"+quantity);
    System.out.println("TOtal :"+Total);
    System.out.println("DIScount :"+discountamount);
    System.out.println("FInalAmount :"+finalAmount);

    return finalAmount;
}

public class programm395 {

    public static void main(String[] args) {

        
      // double bill=
        Product.CalculateBill("leptop", 101, 222000, 1, 10);

      // System.out.println("Payable Amount :"+bill);

    }
    
  } 
}
