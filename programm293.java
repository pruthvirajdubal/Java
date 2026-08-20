
public class programm293 {

    public static void main(String[] args) {
        
        double Amount =5000;
        boolean AccountActive =true;
        boolean paymentVerified =true;


        if(!AccountActive)
        {
            System.out.println("Account is inactive:");
        }
        else if(!paymentVerified)
        {
            System.out.println("payment varification failed:");
        }
        else if(Amount <=0)
        {
            System.out.println("invalid Amount:");
        }
        else 
        {
            System.out.println("payment succesful:");
        }
    }
    
}
