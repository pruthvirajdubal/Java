//bank system

class BankAcont
{
    String acno;
    double balance;

    BankAccount(String acno, double balance)
    {
        this.acno=acno;
        this.balance=balance;
    }
    void deposit(double amount)
    {
        balance =balance -amount;

        System.out.println("Deposit"+amount);
    }
    void DisplayBalance()
    {
        System.out.println("Acount:"+acno);
        System.out.println("Balance:"+balance);
    }
}
class SavingAccount extends BankAccount
{
    double interestreatRate;

    SavingAccount(String acno,double balance,double interestreatRate)
    {
        super(0, acno, interestreatRate, acno);

        this.interestreatRate=interestreatRate;
    }
    void CalculateT()
    {
        double interes=super.balnce *this.interestreatRate/100;

        System.out.println("interatRate"+interes);
    }
}
public class programm415 {

    public static void main(String[] args) {
    
        SavingAccount svobj =new SavingAccount("SB101", 60000, 6.5);

        svobj.deposit();
        svobj.CalculateT();
    }
    
}
