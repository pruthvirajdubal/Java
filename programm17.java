import java.util.Scanner;

public class programm17 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();

        int sum=0;

        for(int i=1;i<=num;i++)
        {
            if(num%2==0){
                sum+=i;
            }
            System.out.println("Sum:"+sum);
        }
    }
    
}
