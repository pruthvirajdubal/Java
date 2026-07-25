import java.util.Scanner;

public class programm25 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();

        if(num % 5==0  && num %11==0)
            System.out.println("DIVISIBLE");
        else
            System.out.println("not DIVISIBLE");
    }
    
}
