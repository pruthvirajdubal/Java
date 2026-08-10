public class programm249 {

    public static void main(String[] args) {
        
        int n=7,i=1,count=0;

        // logic prime nuber
        while (i<=n) {
            if (n%i==0)
                count++;
                 i++;
        }
        if (count==2) {
            System.out.println("prime nuber :");
            
        }
    }
    
}
