public class programm276 {
    public static void main(String[] args) {
        
        double balance=50000;
        double withdraw=10000;

        if(withdraw <=balance)
        {
            balance =balance -withdraw;

            System.out.println("withraw successful");

        }else
        {
            System.out.println("Insufficient balance");
        }
    }
    
}
