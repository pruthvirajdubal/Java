public class programm256 {
    public static void main(String[] args) {
        
        int n=145,sum=0,temp=n;

        while (n!=0) {
            int d=n%10,f=1,i=1;

            while (i<=d) {
                
                f*=i;
                i++;
            }
            sum+=f;
            n/=10;
        }
        if(sum==temp)
            System.out.println("strong number:");
    }
    
}
