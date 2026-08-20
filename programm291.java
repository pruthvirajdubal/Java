public class programm291 {

    public static void main(String[] args) {
        
        String vehicle="SUV";
        double distance =20;
        double fare ;

        switch (vehicle) {
            case "BIKE":
                fare =distance*8;
                break;
              
            case "SEDAN":
                fare=distance*15;
                break;
                
            case "SUV":
                fare =distance*20;
                break;    
        
            default:
                fare =0;
                System.out.println("vehicle not available");
        }
        System.out.println("fare=RS"+fare);
    }
    
}
