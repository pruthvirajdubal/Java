public class programm286 {

    public static void main(String[] args) {
        
        int choice=2;

        double balance =50000;
        double Amount =5000;

        switch (choice) {
            case 1:
                balance +=Amount;
                System.out.println("Amount deposited");
                break;

            case 2:
                if(Amount<=balance)
                    {
                        balance-=Amount;
                        System.out.println("Amont withdreaw:");
                    }
                    else 
                        {
                            System.out.println("Insufficient balance:");

                        }   
                        break;
             case  3:
                System.out.println("Balance:"+balance);            
        
            default:
                System.out.println("Invalid choice");
        }
    }
}
