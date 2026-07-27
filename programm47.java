import java.util.Scanner;

public class programm47 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int count=0,i=1;

        while (count<n) {
            if(i%2==0)
                System.out.println(i);
            count++;
        }
        i++;
    }
    
}
