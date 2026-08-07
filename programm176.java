public class programm176 {

    public static void main(String[] args) {
        
        int n=153,sum=0, temp=n;

        //L O G I C
        while (n!=0) {
             int d=n%10;
             sum+=d*d*d;
             n/=10;
        }
        if(sum==temp)
            System.out.println("Armstrong");
    }
    
}
