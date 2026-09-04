class BankAccount
{
    long AcNo;
    String HolderName;
    double balance;
    String AcType;
    String dob;
    String city;


    void Deposit (double Amount)
    {
        balance +=Amount;
    }
    void withdraw(double Amount)
    {
        if(Amount<=balance)
        
            balance -=Amount;
        
        else
            System.out.println("Insufficient balance:");
    }
    void Display()
    {
        System.out.println("AccountNo:"+AcNo);
        System.out.println("Holder:"+HolderName);
        System.out.println("Balance:"+balance);
        System.out.println("Type:"+AcType);
        System.out.println("DOB:"+dob);
        System.out.println("CITY:"+city);
    }
}

public class programm359 {
    public static void main(String[] args) {

        BankAccount baobj=new BankAccount();
        baobj.AcNo=123456;
        baobj.HolderName="Abasaheb";
        baobj.balance=450000;
        baobj.AcType="Saving";
        baobj.city="pune";

        baobj.Deposit(10000);
        baobj.withdraw(5000);

        baobj.Display();
    }
    
}
