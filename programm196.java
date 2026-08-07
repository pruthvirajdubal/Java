public class programm196 {
    public static void main(String[] args) {
        
        int num =957463 ,max=0;

        for(;num!=0;num/=10) {

            int d=num%10;
            if(d>max)max=d;
        }
        System.out.println("LARGEST="+max);
    }
    
}
