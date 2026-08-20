public class programm287 {
    public static void main(String[] args) {
        
        String status ="Shiped";

        switch (status) {
            case "placed":
                System.out.println("order placed");
                break;
             
            case "packed" :
                System.out.println("order packed:");
                break;
             
            case "shiped" :
                System.out.println("order shiped:");
                break;    
            
            case  "deliverd":
                System.out.println("oreder diliverd:");
                break;
               
            case "canselled":
                System.out.println("order canselled:");
                break;    
                
            default:
                System.out.println("invalid order:");
        }
    }
    
}
