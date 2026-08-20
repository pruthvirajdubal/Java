public class programm292 {

    public static void main(String[] args) {
        
        double balance =50000;

        double withdreawAmount=10000;

        if(withdreawAmount> 0 && withdreawAmount <=balance)
        {
            balance =balance -withdreawAmount;
            System.out.println("withdraw Successful:");
            System.out.println("remaining alance:"+balance);
        }
        else if (withdreawAmount <=0)
        {
            System.out.println("Invalid Amount:");
        }
        else 
        {
            System.out.println("insufficient balance:");
        }
    }
    
}
