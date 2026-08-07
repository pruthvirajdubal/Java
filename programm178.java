public class programm178 {

    public static void main(String[] args) {
        
        int n=121,rev=0,temp=0;

        temp=n;

        //P A L I N D R O M
        while (n!=0) {
                rev=rev*10+n%10;
                n/=10;
        }
        if(temp==rev)
            System.out.println("Palindrom");
    }
    
}
