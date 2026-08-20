public class programm279 {

    public static void main(String[] args) {
        
        double Amount =2500;
        double waletBalance=5000;

        if(waletBalance>=Amount)
        {
            waletBalance -=Amount;
            System.out.println("Payment successful");

        }
        else
        {
            System.out.println("paymenet filled insuuficient balance");
        }
    }
    
}
