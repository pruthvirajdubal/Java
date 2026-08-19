public class programm265 {
    public static void main(String[] args) {
        
        double balance =50000;
        double withdraw =10000;

        if(withdraw<=balance)
        {
            System.out.println("withdraw sucessfull");
            System.out.println("Remaining balance:"+balance);
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }
    
}
