
class BankWithdraw 
{
    static double withdraw(String customer,long acno,double balance,double amount) 
    {

    if (amount <=0)
    {
        System.out.println("Invalid Amount :");
    }
    if(amount >=balance)
    {
        System.out.println("Insufficient balance :");
        return balance;
    }
    balance =balance -amount;

    System.out.println("Customer :"+customer);
    System.out.println("ACNO :"+acno);
    System.out.println("WITHDRAW :"+amount);
    System.out.println("BALANCE :"+balance);

    return balance;
  
}

public class programm392 {

    public static void main(String[] args) {
        BankWithdraw.withdraw("Ranjit", 900909090, 450000, 2300);

        System.out.println("Final balance :");
        

    }
    
    
    }
}
