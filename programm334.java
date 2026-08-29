public class programm334 {
    /*PAYMENT Mthod */
    public static void main(String[] args) {
        
        String PAYMENT="UPI";

        switch (PAYMENT) {
            case "UPI":
                System.out.println("Payment using UPI");
                break;

            case "CARD" :
                System.out.println("PAyment using card:");
                break;
                
            case "CASH" :
                System.out.println("Payment using CASH:"); 
                break;
        
            default:
                break;
        }
    }
    
}
