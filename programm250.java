public class programm250 {
    public static void main(String[] args) {
        
        int a=0,b=1,i=1;

        while (i<=5) {
            
            System.out.print(a+"");
            int c=a+b;
            a=b;
            b=c;
            i++;
        }
    }
    
}
