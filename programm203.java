public class programm203 {

    public static void main(String[] args) {
        
        int num=153,sum=0,temp=num;

        for(;num!=0;num/=10) {
            int d=num%10;
            sum+=d*d*d;
        }
        if(sum==temp)
            System.out.println("Armstrong");

        else 
            System.out.println("not Armstrong");

    }
    
}
