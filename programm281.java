public class programm281 {
    public static void main(String[] args) {
        
        int stock =10;
        int requestQuantity=5;

        if(requestQuantity <=stock)
        {
            stock-=requestQuantity;
            System.out.println("order confirmed");
        }
        else
        {
            System.out.println("out of stack");
        }
    }
    
}
