public class programm241 {
    public static void main(String[] args) {
        
        /*
        FACTORIAL 5=5*4*3*2*1
         */
        int n=5,fact=1,i=1;

        while (i<=n) {
            
            fact*=i;
            i++;
        }
        System.out.println(fact);
    }
    
}
