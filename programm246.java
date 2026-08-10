public class programm246 {
    public static void main(String[] args) {
        
        int num=8796,max=0;

        while (num!=0) {
            int d=num%10;
            if(d>max)
                max=d;
            num/=10;
            
        }
        System.out.println("max number:"+max);
    }
    
}
