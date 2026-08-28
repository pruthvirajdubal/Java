import java.util.Scanner;

public class programm323 {

    public static void main(String[] args) {
        
        Scanner sobj =new Scanner(System.in);

        int CorrectOtp =9876;
        int Attempt = 0;

        while (Attempt <3)
        {
            System.out.println("Enter OTP...");
            int otp =sobj.nextInt();
        
           if(otp ==CorrectOtp)
           {
                System.out.println("OTP varified Sucess...");
                break;
           }
           Attempt++;
           System.out.println("Invalid OTP...");
         
        } 
        
    }
    
}
