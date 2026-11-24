//ATM Transaction

import java.util.Scanner;

class ATM {
    String cardholder;
    int pin;
    double balance;

    ATM( String cardholder,int pin,double balance)
    {
        this.cardholder=cardholder;
        this.pin=pin;
        this.balance=balance;
    }

    void withdraw (int entierpin,double amount)
    {
        if( entierpin!=pin)
        {
            System.out.println("WRONG PIN");
        }
        else if(amount >balance)
        {
            System.out.println("Insufficient balance:");
        }
        else if(amount <=0)
        {
            System.out.println("Invalid amount..");
        }
        else
        {
            balance =balance -amount;

            System.out.println("Withdraw sucessful..");
            System.out.println("Remaining Balance:"+balance);
        }
    }
}
public class programm409 {
    public static void main(String[] args) {
        
        Scanner sobj =new Scanner(System.in);

        ATM  aobj = new ATM("pruthvi", 1234, 50000);

        System.out.println("Enter pin:");
        int pin =sobj.nextInt();

        System.out.println("Enter amount:");
        double amount =sobj.nextDouble();

        aobj.withdraw(pin, amount);
    }
    
}
