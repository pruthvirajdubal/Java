public class programm243 {
    public static void main(String[] args) {
        
        int num=12345, rev=0;
/*
REVERSE NUMBER */

        while (num!=0) {

            // L O G I C 
            rev=rev*10+num%10;
            num/=10;
            
        }
        System.out.println(rev);
    }
    
}
