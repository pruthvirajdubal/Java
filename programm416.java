
class User 
{
    String username;
    String email;

    User(String username, String email)
    {
        this.username=username;
        this.email=email;
    }
    void login()
    {
        System.out.println(username+"Login in");
    }

}

    class Customer extends User
    {
        int customernid;

        Customer(String username,String email, int customernid)
        {
            super(username, email);
            this.customernid=customernid;

        }
        void placeOrder()
        {
            super.login();

            System.out.println("Customre id:"+this.customernid);
            System.out.println(this.username+"place order:");
        }
    }
public class programm416 {

    public static void main(String[] args) {
        Customer cobj = new Customer("pruthvi", "pruthvi@123gmail.com", 1011);

        cobj.placeOrder();
        
    }
    
}
