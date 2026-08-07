public class programm194 {

    public static void main(String[] args) {
        int num=12345,sum=0;

        for(;num!=0;num/=10) {

            sum+=num%10;
        }
        System.out.println("SUM="+sum);
    }
    
}
