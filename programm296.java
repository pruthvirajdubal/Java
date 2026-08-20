public class programm296 {

    public static void main(String[] args) {
        
        String uesrname ="ADMIN";
        String password ="admin123";

        String enterusername ="ADMIN";
        String enterpassword="admin123";

        if(uesrname.equals(enterusername) && password.equals(enterpassword))
        {
            System.out.println("LOGIN Successful");
        }
        else 
            {
                System.out.println("Invalid username and password:");
            }
    }
    
}
