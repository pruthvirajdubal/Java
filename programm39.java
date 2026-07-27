import java.util.Scanner;

public class programm39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        int num =sc.nextInt();
        int decimal=0,base=1;

        while (num>0) {
            int last =num%10;
            decimal+=last*base;
            base*=2;
            num/=10;
        }
        System.out.println("Decimal="+decimal);
    }
    
}
