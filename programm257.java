public class programm257 {
    public static void main(String[] args) {
        
        int n=9,s=n*n,sum=0;

        while (s!=0) {
            sum+=s%10;
            s/=10;
        }
        if(sum==n)
            System.out.println("neon");
    }
    
}
