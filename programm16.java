import java.util.Scanner;

public class programm16 {
    /*
    COUNT NUMBER OF DIGIT
     */
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();

        int count=0;

        // L O G I C
        while (num!=0) {
            num=num/10;
            count++;
        }
        System.out.println("Count:"+count);
    }
    
}
