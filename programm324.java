import java.util.Scanner;
public class programm324 {
/*
LOGIN ATTEMPT SYSTEM
 */
    public static void main(String[] args) {
        
        Scanner sobj =new Scanner(System.in);

        String username="Admin";
        String pass="1234";
        int Attempt =0;

        while (Attempt <3) 
        {
            System.out.println("Enter username..");
            String  user =sobj.next();

            System.out.println("Enter password..");
            String password =sobj.next();

            if(username.equals("Admin") && pass.equals("1234"))
            {
                System.out.println("LOgin suecssful...");
                break;
            }
            Attempt++;
            System.out.println("Invalid login");
        }



    }
    
}
