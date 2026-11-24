//LOGIN username,password otp
class Login{
    String username;
    int otp;
    String password;

    Login(String username,String password,int otp)
    {
        this.username=username;
        this.password=password;
        this.otp=otp;
    }

    void verify(){

        if(username.equals("pruthvi") && password.equals("100100") && otp==1234)
        {
            System.out.println("LOGIN SUCESSFULL..");
        }
        else 
        {
            System.out.println("Invalid username &password.."); 
        }
    }
}

public class programm407 {

    public static void main(String[] args) {
        
        Login lobj =new Login("pruthvi", "100100", 1234);

        lobj.verify();
    }
    
}
