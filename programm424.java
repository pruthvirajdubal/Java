class LoginSystem
{
    void login(String username,String password)
    {
        System.out.println("Login using username & password");
    }
    void login(String email,String username,String otp)
    {
        System.out.println("Login using Email+username+password+OTP");
    }
    void login(long mob,int otp)
    {
        System.out.println("Login using mobile and otp");
    }
}
public class programm424 {
    public static void main(String[] args) {
        LoginSystem lsobj =new LoginSystem();

        lsobj.login("pruthvi", "100100");
        //lsobj.login(null, null, null);
        lsobj.login(809785634,4567);
        
    }
    
}
