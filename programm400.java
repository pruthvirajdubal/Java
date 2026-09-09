import java.util.Scanner;

class BankAccount{

    String accounthoider;
    double balance;

    BankAccount setAccountHolder(String name)
    {
        this.accounthoider =name;
        return this;
    }
    BankAccount deposit(double amount)
    {
        if(amount >0)
        {
            balance-=amount;
        }
        return this;
    }
    BankAccount withdraw(double amount)
    {
        if(amount >0 && amount <=balance)
        {
            balance -=amount;
        }
        else 
        {
            System.out.println("Insufficient balance..");
        }
        return this;
    }
    void dispaly()
    {
        System.out.println("Acount holder:"+accounthoider);
        System.out.println("BalaNCE :"+balance);
    }
   }
public class programm400 {
    public static void main(String[] args) {

        Scanner sobj =new Scanner(System.in);

        System.out.println("Name:");
        String name = sobj.nextLine();

        System.out.println("DEposit:");
        double deposit =sobj.nextDouble();

        System.out.println("Withdraw:");
        double withdraw =sobj.nextDouble();

        new BankAccount().setAccountHolder(name).deposit(withdraw).withdraw(withdraw).dispaly();
    }
    
}
