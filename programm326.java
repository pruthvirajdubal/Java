import java.util.Scanner;
public class programm326 {
    /*BANK DEPOSIT */
    public static void main(String[] args) {
        
        Scanner sobj =new Scanner(System.in);

        int balance=10000;
        int Choice=-1;

        while (Choice !=0)
         {
             System.out.println("1.Balance"); 
             System.out.println("2.Deposit");
             System.out.println("3.Withraw"); 
             System.out.println("4.Exit");    

             System.out.println("choice:");
             Choice=sobj.nextInt();

             if(Choice==1)
             {
                System.out.println("Balance:"+balance);
             }
             else if(Choice==2)
             {
                System.out.println("Deposit Amount:");
                int Amount =sobj.nextInt();
                balance+=Amount;
             }
             else if(Choice==3)
             {
                System.out.println("Withdraw Amount:");
                int Amount=sobj.nextInt();

                if(Amount<=balance)
                {
                    balance-=Amount;
                    System.out.println("Withdraw Sucessful...");
                }
                else 
                {
                    System.out.println("Insufficient balance");
                }
             }
        }
    }
    
}
