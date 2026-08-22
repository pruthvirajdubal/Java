public class programm304 {

    public static void main(String[] args) {
        
        double Amount =2500;
        double WallBalance=5000;
        boolean paymentGatewayActive=true;
        boolean AccountBlocked=false;

        if(Amount >0)
        {
            if(!AccountBlocked)
            {
                if(paymentGatewayActive)
                {
                    if(WallBalance >=Amount)
                    {
                        WallBalance -= Amount;
                        System.out.println("payment Succesful..");
                        System.out.println("Remaing balanc:"+WallBalance);
                    }
                    else
                    {
                        System.out.println("Payment failed:insufficient balance:");
                    }

                }
                else
                {
                    System.out.println("Payment gatway is down");
                }
            }
            else 
            {
                System.out.println("Account is bolcked");
            }

        }
        else 
        {
            System.out.println("Invalid payment Amount:");
        }
    }
    
}
