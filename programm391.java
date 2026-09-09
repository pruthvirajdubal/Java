class Bank{
    static double calculateBalance (
                        
                            String name , int acno,
                            double balance ,double deposit,
                             String city ){

            double newBalance =balance +deposit;

            System.out.println("ACNAME :"+name);
            System.out.println("ACNO :"+acno);
            System.out.println("BALANCE :"+balance);
            System.out.println("DEPOSIT :"+deposit);
            System.out.println("CITY :"+city);

            return newBalance;

                                    
}
public class programm391 {

    public static void main(String[] args) {
        
        Bank.calculateBalance("Aba", 56473264, 550000, 3000, "pune");
    }
    
          } 
}
