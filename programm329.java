import java.util.Scanner;
public class programm329 {
    /*
    ATM MENU SYSTEM */
    public static void main(String[] args) {
        Scanner sobj =new Scanner(System.in);
        int Choice =sobj.nextInt();
        System.out.println("Enter Choice"+Choice);
         

        switch (Choice) {
            case 0:
                System.out.println("===-------BOI------------------");
                System.out.println("Check balace:");
                break;
             case 1:
                 System.out.println("===-------BODI------------------");
                System.out.println("Wthdraw mony:");
                break;
             case 2:
                 System.out.println("===-------BODI------------------");
                System.out.println("Deposit money:");
                break;
             case 3:
                 System.out.println("===-------BODI------------------");
                System.out.println("Invalid balance:");
                break;
             case 4:
                 System.out.println("===-------BODI------------------");
                System.out.println("Exit:");
                break;    
            default:
                break;
        }
        
    }
    
}
