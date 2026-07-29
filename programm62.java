public class programm62{

    public static void main(String[] args) {
        /*
        SUM OF DIGIT
         */
        int n=12345,sum=0;

        while (n!=0) {
            sum+=n%10;n/=10;
        }
        System.out.println(sum);
    }
}