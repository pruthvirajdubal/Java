class Acount 
{
    void calculateInterst()
    {
        System.out.println("Generic account interest");
    }
    class SavingAccount extends Acount
    {
        @Override

         void calculateInterst()
         {
            System.out.println("Saving acount 6% interstr..");
         }

         class CurrentAccount extends Acount
         {
            @Override
            void calculateInterst()
            {
                System.out.println("Curent Acount is 4% interst..");
            }
         }
    }
}

public class programm426 {
    public static void main(String[] args) {

        Acount ac;

       // ac = new SavingAccount();
        ac.calculateInterst();
        
    }
    
}
