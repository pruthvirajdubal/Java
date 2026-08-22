import java.util.*;
public class programm305 {

    public static void main(String[] args) {
        
        System.out.println("===============pruthvi Bank==============");
        System.out.println("1.check balance..");
        System.out.println("2.Deposit...");
        System.out.println("3.withdraw..");
        System.out.println("4.exit");

        double bankbalance=1000;


        Scanner sobj =new Scanner(System.in);

        int choice =sobj.nextInt();

        if(choice ==1)
        {
            System.out.println("Your curretn balance:"+bankbalance);
        }
        else if(choice==2)
        {
            System.out.println("Enter Deposit Amount:");
            double Amount =sobj.nextDouble();

            if(Amount <0)
            {
                System.out.println("Amount Negative...");
            }
            else 
            {
                bankbalance +=Amount;
                System.out.println("Deposit sucessful ..current bankbalance="+bankbalance);
            }
        }
    }
    
}
