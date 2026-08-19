public class programm254 {
    public static void main(String[] args) {
        
        int n=12,i=1,count=0;

        while (i<=n) {
            if(n%i==0)
                count++;
            i++;
        }
        System.out.print(count);
    }
    
}
