import java.util.Scanner;
public class programm322 {
    
    public static void main(String[] args) {
        
        Scanner sobj =new Scanner(System.in);
        
        int CorrectPin=1234;
        int Attempt=0;
        boolean sucess=false;

        while(Attempt <3)
        {
            System.out.println("Enter Pin...");
            int pin=sobj.nextInt();

            if(pin==CorrectPin)
            {
                sucess =true;
                break;
            }
            Attempt++;
            System.out.println("Worng Pin");

        }
        if(sucess)
        {
            System.out.println("ATM Acess Granted...");

        }else
        {
            System.out.println("Card block");
        }
    }
}
