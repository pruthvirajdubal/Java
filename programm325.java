import java.util.Scanner;

public class programm325 {
    /*
    SHOPING CART
     */
    public static void main(String[] args) {
        
        Scanner sobj =new Scanner(System.in);

        int Total =0;
        int choice=1;

        while (choice !=0)
         {
            System.out.println("1.Add Product."); 
            System.out.println("2.check out.");
            
            System.out.println("Enter choice:");
            choice =sobj.nextInt();
            
            if(choice==1)
            {
                System.out.println("Enter product price.");
                int price=sobj.nextInt();

                Total =Total+price;
            }
        }
        System.out.println("Total bill="+Total);
    }
    
}
