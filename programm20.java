import java.util.Scanner;

public class programm20 {
    /*
    CHECK ARMSTRONG NUMBER
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int original=num;
        int sum=0;

        //L O G I C
        while (num !=0) {
            int digit = num % 10;
            sum+=digit*digit*digit;
            num=num/10;
        }
        if(sum==original)
            System.out.println("Armstrong");
        else
             System.out.println("NOT  Armstrong");
    }
    
}
