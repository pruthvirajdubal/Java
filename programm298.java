public class programm298 {
    
    public static void main(String[] args) {
        
        double distance =15;
        double fare;

        if(distance <=5)
        {
            fare =distance *15;
        }
        else if(distance <=15)
        {
            fare =distance *12;
        }
        else 
        {
            fare =distance *10;
        }
        System.out.println("total fare"+fare);
    }
    
}
