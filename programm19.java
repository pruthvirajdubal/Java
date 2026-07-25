import java.util.Scanner;

public class programm19 {

    /*
    LARGEST DIGIT IN A NUBER
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int max=0;

        //L O G I C
        while (num!=0) {

            int digit=num%10;

            if(digit>max)
                max=digit;
                num=num/10;
        }
        System.out.println("Largest Digit="+max);
    }
    
}
