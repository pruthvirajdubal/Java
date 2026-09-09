class Login {

    public boolean validateLogin(

                String username,
                String password,
                String registerusername,
                String registerpassword
    ){

        if(username.equals(registerusername) && password.equals(registerpassword))
        {
            return true;
        }
        return false;
}
public class programm397 {

    public static void main(String[] args) {
        Login lobj =new Login();

        lobj.validateLogin("pruthvi","java123",
        "pruthvi","java123");
        

    }
   
  }
}
