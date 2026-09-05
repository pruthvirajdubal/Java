/*ATM user Account */
class ATM
{
    int cardnumber;
    String holdername;
    int pin;
    double balance;

    void withdraw(int enterpin,double amount)
    {
        if(enterpin==pin)
        {
            if(amount <=balance)
            {
                balance -=amount;
                System.out.println("Withdraw sucessful.");
                System .out.println("Remaining balance:"+balance);
            }
            else 
            {
                System.out.println("Insufficient balance:");
            }
           
        }
         else 
            {
                System.out.println("Invalid pin");
            }
    }
}


public class programm363 {

    public static void main(String[] args) {

        ATM user =new ATM();
        user.cardnumber=1234;
        user.holdername="Anna";
        user.pin=9999;
        user.balance=450000;

        user.withdraw(9999, 10000);
        
    }
    
}
