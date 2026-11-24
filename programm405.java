//BANKING 

import java.util.Scanner;

class BankAccount{

    int acno;
    String holdername;
    double balnce;
    String actype;

    BankAccount(int acno, String holdername,double balnce,String actype)
    {
        this.acno=acno;
        this.holdername=holdername;
        this.balnce=balnce;
        this.actype=actype;
    }

    void dispaly(){
        System.out.println("\nBank Account:");
        System.out.println("AcountNumber:"+acno);
        System.out.println("HOLDER:"+holdername);
        System.out.println("TYPE:"+actype);
        System.out.println("BALANCE:"+balnce);
    }
}
public class programm405 {
    public static void main(String[] args) {
        
        Scanner sobj =new Scanner(System.in);

        System.out.println("AcountNO:");
        int no=sobj.nextInt();

        System.out.println("HOLDERNAME:");
        String name =sobj.nextLine();

        System.out.println("BALANCE:");
        double balance=sobj.nextDouble();

        System.out.println("ACOUNT TYPE:");
        String type =sobj.nextLine();

        BankAccount baobj =new BankAccount(no, name, balance, type);

        baobj.dispaly();
    }
    
}
