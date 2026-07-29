public class programm61 {
    public static void main(String[] args) {
        
        int n=121,t=n,r=0;

        while (n!=0) {
            r=r*10+n%10;
            n/=10;

            System.out.println(t==r);
            
        }
    }
    
}
