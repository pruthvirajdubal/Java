public class programm297 {

    public static void main(String[] args) {
        int stock =25;
        int requestQuantity=10;

        if(requestQuantity <=0)
        {
            System.out.println("Linvalid Quantity:");
        }
        else if(requestQuantity <= stock)
        {
            stock =requestQuantity -stock;
            System.out.println("order confirmed:");
            System.out.println("Ramaing Stock:"+stock);
        }
        else 
        {
            System.out.println("insuuficient balance:");
        }
    }
    
}
