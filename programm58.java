public class programm58{

    public static void main(String[] args) {
        
        /*
        PRIME NUMBER */
        int a=7,b=0;

        for(int i=1;i<=a;i++) {
            if(a%i==0)
                b++;

            System.out.println(b==2);
        }
    }
}