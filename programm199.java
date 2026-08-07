public class programm199 {
    public static void main(String[] args) {
        
        int n=10,sum=0;

        for(int i=1;i<=n;i++) {

            if(i%2!=0)
                sum+=i;
        }
        System.out.println("SUM="+sum);
    }
    
}
