import java.sql.Connection;

public class programm327 {
    /*
    SERVER CONNECTION */

    public static void main(String[] args) {
        
        int Attempt =0;
        boolean Connect =false;

        while (Attempt<3)
         {
            Attempt++;
        
            System.out.println("Connection..Attempt:"+Attempt);
        }
        if(Attempt==3)
        {
            Connect=true;
        }
    
       if(Connect)
          {
        System.out.println("Server connected...");
          }
        else 
          {
        System.out.println("FAiled...");
              }

    }
    
}
