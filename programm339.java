public class programm339 {

    public static void main(String[] args) {
        
        int [] transaction ={5000,-1200,3000,-500,-800};

        int balance=10000;

        for(int Amount: transaction)
        {
            balance+=Amount;
        }
        System.out.println("Final balance:"+balance);
    }
    
}
