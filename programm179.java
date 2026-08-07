public class programm179 {

    public static void main(String[] args) {
        
        int n=145,sum=0,temp=n;

        // L O G I C
        while (n!=0) {
            
            int d=n%10,f=1;

            for(int i=1;i<=d;i++) 
                f*=i;
            sum+=f;
            n/=10;
        }
        if (sum==temp) {
            System.out.println("Strong");
        }
    }
    
}
