public class programm303 {

    public static void main(String[] args) {
        
        int age =30;
        double salary =60000;
        int CreditScour =750;

        if(age >=21  && age<=60 )
        {
            if(salary>=30000)
            {
                if(CreditScour>=700)
                {
                    System.out.println("Lone Approved:");
                }
                else 
                {
                    System.out.println("Lone Reject:LOW CreditScoure:");
                }
                
            }
            else
            {
                System.out.println("Lone Reject:Age criteriya not match:");
            }
        }
    }
    
}
