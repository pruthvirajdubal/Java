import java.util.Scanner;

public class programm38 {
    public static void main(String[] args) {
        /*
        CONVERT DECIMAL TO BINARY 
        */
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();

       int[] binary=new int[32];
       int i=0;

       while (num>0) {
        binary[i]=num%2;
        num=num/2;
        i++;
       }
       for(int j=i-1;j>=0;j--) {
        System.out.print(binary[j]);
       }
    }
    
}
