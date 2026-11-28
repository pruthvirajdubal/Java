class BankService
{
    void transfer(int Acountno,double amount)
    {
        System.out.println("Transfer:"+amount+"To Acount:"+Acountno);
    }
    void transfer (int fromAmount,int toAcount,double amount)
    {
        System.out.println("Transfer:"+amount+"Frome"+fromAmount+"TO"+toAcount);
    }
}

public class programm421 {
    
    public static void main(String[] args) {
        BankService bs =new BankService();

        bs.transfer(101, 5000);
        bs.transfer(101, 202, 10000);
    }
}
