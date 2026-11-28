
class Payment 
{
    void makePayment(double amount)
    {
        System.out.println("Generic payment:"+amount);
    }
}
class UPIPayment extends Payment
{
    @Override
    void makePayment(double amount)
    {
        System.out.println("UPI Payment:"+amount);
    }
}
class CARDPayment extends Payment
{
    @Override
    void makePayment(double amount)
    {
        System.out.println("CARD Payment:"+amount);
    }
}
class NETBanking extends Payment
{
    @Override
    void makePayment(double amount)
    {
        System.out.println("NET Banking Payment:"+amount);
    }
}

public class programm427 {
    public static void main(String[] args) {

        Payment payment;

        payment=new UPIPayment();
        payment.makePayment(1000);

        payment=new CARDPayment();
        payment.makePayment(2000);

        payment = new NETBanking();
        payment.makePayment(3000);
        
    }
    
}
