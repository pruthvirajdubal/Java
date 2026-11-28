class PaymentService
{
    void pay(double amount)
    {
        System.out.println("CASH /Amount"+amount);
    }
    void pay(String holdename,double amount)
    {
        System.out.println(" holdername :"+holdename+"Amount :"+amount);
    }
    void pay(long Cardnu,double amount)
    {
        System.out.println("Card payment :"+Cardnu+"Amount :"+amount);
    }
}

public class programm425 {
    public static void main(String[] args) {
        
        PaymentService ps =new PaymentService();
        ps.pay(500);
        ps.pay("pruthvi@123", 1500);
        ps.pay(457835567, 5000);
    }
    
}
