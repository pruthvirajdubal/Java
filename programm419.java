class Bank
{
    String bankname;

    Bank(String bankname)
    {
        this.bankname=bankname;
    }
    void bankDetails()
    {
        System.out.println("Bank:"+bankname);
    }
}
class Account extends Bank
{
    int acountno;
    double balance;

    Account( String bankname,int acountno,double balance)
    {
        super(bankname);
        this.acountno=acountno;
        this.balance=balance;
    }
    void AccountDetails()
    {
        System.out.println("AccountNO:"+acountno);
        System.out.println("Balance:"+balance);
    }
}

class SavingAccount extends Account
{
    double interestreatRate;

    SavingAccount(String bankname,int acountno,double balance,double interatRate)
    {
        super(bankname, acountno, balance);
        this.interestreatRate=interatRate;
    }

void calculateInterst()
{
    double intrest =balance *interestreatRate/100;

    System.out.println("interestreatRate"+interestreatRate);
   }
}

public class programm419 {
 
    public static void main(String[] args) {
        
        SavingAccount saobj =new SavingAccount("SBI", 601, 50000, 6.5);

        saobj.AccountDetails();
        saobj.calculateInterst();
        saobj.bankDetails();
    }
}
