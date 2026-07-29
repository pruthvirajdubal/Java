public class programm60 {
    /*
    REVERSE NUMBER
     */
    public static void main(String[] args) {
        int n=12345,rev=0;


        //L O G I C
        
        while (n!=0)  {

            rev=rev*10+n%10;
                n/=10;
            
        }
        System.out.println(rev);
    }
    
}
