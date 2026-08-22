public class programm302 {

    public static void main(String[] args) {
        
        boolean authenticated=true;
        String role ="ADMIN";

        if(authenticated)
        {
            if(role.equals("ADMIN"))
            {
                System.out.println("Access Granted Dashboard:");
            }
            else 
            {
                System.out.println("Access Denied:Admin onlu");
            }
        }
        else 
        {
            System.out.println("Please login:");
        }
    }
    
}
