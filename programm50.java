import java.util.Scanner;

public class programm50 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();

        int square=num*num;
        int sum=0;

        while (square !=0) {
            sum+=square %10;
            square/=10;
        }
        if(sum==num)
            System.out.print("neoun nuber");
        else
            System.out.print("not neoun number");
    }
    
}
