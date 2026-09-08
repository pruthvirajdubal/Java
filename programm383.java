class Bank
{
    long ACNO;
    String holdename;
    double balance;

}

public class programm383 {

    public static void main(String[] args) {
    
        Bank bobj =new Bank();

        bobj.ACNO=98765432;
        bobj.holdename="RAJU patil.";
        bobj.balance=45000;

        System.out.println("ACNO :"+bobj.ACNO);
        System.out.println("HOLDERNAME :"+bobj.holdename);
        System.out.println("BALANC :"+bobj.balance);
    }
    
}
