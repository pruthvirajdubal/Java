public class programm211 {
    public static void main(String[] args) {
        
        int n=12,sum=0;

        for(int i=1;i<=n;i++) {
            if(n%i==0)
                sum+=i;

        }
        System.out.println("SUM="+sum);
    }
    
}
