import java.util.Scanner;
 // LOGIN SYSTEM
class Login{

    String username;
    String password;
    int otp;

    Login setUesrname(String username)
    {
        this.username = username;
        return this;
    }
    Login setPasswprd(String password)
    {
        this.password=password;
        return this;
    }
    Login setOtp(int otp)
    {
        this.otp=otp;
        return this;
    }

    void varify() 
    {
        if(username.equals("pruthvi") && password.equals("lakh10") && otp==1234)
        {
            System.out.println("Login Sucessful..");
        }
        else
        {
            System.out.println("Logim Failed..");
        }
    }
}

public class programm399 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Username :");
        String username =sobj.nextLine();

        System.out.println("Password :");
        String pasword =sobj.nextLine();

        System.out.println("OTP :");
        int opt =sobj.nextInt();

        new Login().setUesrname(username).setPasswprd(pasword).setOtp(opt).varify();
    }
    
}
