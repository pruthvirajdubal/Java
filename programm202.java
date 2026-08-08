public class programm202 {

    public static void main(String[] args) {
        
        int num=555,rev=0,temp=num;

        //LOGIC*
        for(;num!=0;num/=10) {
            rev=rev*10+num%10;
        }
        if(temp==rev)
            System.out.println("Palindromm");
        else 
            System.out.println("not palindrom");
    }
    
}
