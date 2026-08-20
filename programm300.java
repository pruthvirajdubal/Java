

public class programm300 {

    public static void main(String[] args) {
       
        int Enterpin=1234;
        int coorectpin=1234;
        int balance =10000;

        if(Enterpin==coorectpin)
        {
            if(balance >0)
            {
                System.out.println("ATM Access granted:");
            }
            else
            {
                System.out.println("Insufficient balance:");
            }
          
        }
          else 
            {
                System.out.println("Incoorect PIN");
            }

    }
    
}
