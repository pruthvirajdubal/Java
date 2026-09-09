class ShopingCart
{
    public static double calculatecart(

                String customer,
                String product1,
                double price1,
                String product2,
                double price2,
                int qty1,
                int qty2
    ){
        double Total1=price1*qty1;
        double Total2=price2 *qty2;

        double AllTotal =Total1 +Total2;

        System.out.println("Total1 :"+Total1);
        System.out.println("Totao2 :"+Total2);
        System.out.println("AllTotal :"+AllTotal);

        return AllTotal;
}

public class programm396 {
    public static void main(String[] args) {

        ShopingCart.calculatecart("pruthvi","Leptop",60000,"mouse",500,2,1);
        

    }
  } 
}
