public class programm64 {
    /*
    LAGEST DIGIT
     */
    public static void main(String[] args) {
        int n=56789,max=0;


        // L O G I  C
        while (n!=0) {
            int d=n%10;

            if(d>max)
                max=d;
            n/=10;
        }
        System.out.println(max);
    }
    
}
