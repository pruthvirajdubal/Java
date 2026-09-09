class ATM 
{
    static void transation (
                    
                            String name ,
                            int  accountno,
                             double balance,
                              String transationtype ,
                              double amount )
    {
        if(transationtype.equalsIgnoreCase("deposit"))
        {
            balance =balance -amount;
        }
        else if (transationtype.equalsIgnoreCase("withdraw"))
        {
            if(amount<=balance)
            {
                balance =balance -amount;
            }
            else 
            {
                System.out.println("Insufficient balane") ;

                return ;
            }
            
        }
        else 
        {
            System.out.println("invalid transaction :");
            return ;
        }

        System.out.println("Customer :"+name);
        System.out.println("Acount :"+accountno);
        System.out.println("Transaction :"+transationtype);
        System.out.println("Balance :"+balance);

    }

}

public class programm393 {

    public static void main(String[] args) {

        ATM.transation("bapu", 100002, 50000, "withdraw", 20000);
        
    }
    
}
