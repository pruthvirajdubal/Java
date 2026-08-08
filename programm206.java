public class programm206 {
    public static void main(String[] args) {
        
        int n=10,a=0,b=1;

        // FIBONACCI SERIES
        for(int i=1;i<=n;i++) {

            System.out.println(a);

            int c=a+b;
            a=b;
            b=c;
        }


    }
    
}
