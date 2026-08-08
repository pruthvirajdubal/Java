public class programm205 {

    public static void main(String[] args) {
        
        int num=145,sum=0,temp=num;

        for(;num!=0;num/=10) {
            int d =num%10,f=1;

            for(int i=1;i<=d;i++) {
                f*=i;
            }
            sum+=f;
        }
        if(sum==temp)
            System.out.println("Strong");
        else 
            System.out.println("not stronge");

    }
    
}
