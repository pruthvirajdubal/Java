public class programm335 {
    /* ONLINE ORDER STATUS */
    public static void main(String[] args) {
        
        String status ="Shiped";

        switch (status) {
            case "PLACED":
                System.out.println("ORDER PLACED");
                break;
             case "PACKED" :
                System.out.println("ORDER PACKED:");
                break;
            case "Shiped":
                System.out.println("ORDER Sgiped:");
                break;
                
            case "DELIVERD" :
                System.out.println("order Deliverd");
                break;
            case "CANCELLED":
                System.out.println("Ordr cancelled:");
        
            default:
                System.out.println("Invalid Status:");
                break;
        }
    }
    
}
