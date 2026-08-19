public class programm267 {
    public static void main(String[] args) {
        
        double balance =50000;
        double withdraw=10000;

        if(withdraw<=balance)
        {
            balance =balance -withdraw;
            System.out.println("Withdraw Sucessul");
            System.out.println("Remaining balance:"+balance);
        }
        else
        {
            System.out.println("insufficient balance:");
        }
    }
    
}
