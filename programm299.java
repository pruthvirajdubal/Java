public class programm299 {

    public static void main(String[] args) {
        
        int hertrate =130;
        int age=70;

        if(hertrate >120 && age >=60)
        {
            System.out.println("Emergency priority:");
        }
        else if(hertrate >100)
        {
            System.out.println("high priority:");
        }
        else if (hertrate >=60)
        {
            System.out.println("normal priority:");
        }
        else 
        {
            System.out.println("need medical:");
        }
    }
    
}
