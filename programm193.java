public class programm193 {

    public static void main(String[] args) {
        
        int num=12345678,rev=0;


        //LOGIC**
        for(;num!=0;num/=10) {

            rev=rev*10+num%10;
        }
        System.out.println("REVERSE="+rev);
    }
    
}
