public class programm195 {

    public static void main(String[] args) {
        
        int num=1234,prod=1;

         for(;num!=0;num/=10) {

            prod*=num%10;
         }

         System.out.println("product="+prod);


    }
    
}
