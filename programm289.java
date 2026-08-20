public class programm289 {

    public static void main(String[] args) {
        
        String payment ="CARD";

        switch (payment) {
            case "UPI":
                System.out.println("processing upi payment:");
                break;
            
            case "CARD" :
                System.out.println("processing card payment:");
                break;
             
            case "NET_BANKING":
                System.out.println("processing net_bankink payment:");
                
            case "WALLET":
                System.out.println("processing wallet payment:");
                break;    
            default:
                System.out.println("payment method not support:");;
        }
    }
    
}
