public class programm63 {
    /*
    COUNT DIGIT
     */
    public static void main(String[] args) {
        int n=123456789,c=0;

        while (n!=0) {
            c++;
            n/=10;

            System.out.print(c);
        }
    }
    
}
