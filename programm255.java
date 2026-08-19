public class programm255 {
    public static void main(String[] args) {
        
        int n=6, i=1,sum=0;

        while (i<n) {
            if(n%i==0)
                sum+=i;
            i++;
        }
        if(sum==n)
            System.out.println("perfect:");
    }

    
}
