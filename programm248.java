public class programm248 {
    public static void main(String[] args) {
        
        int num=153,sum=0,temp=num;

        // ARMSTRING NUMBER LOGIC
        while (num!=0) {
            int d=num%10;
            sum+=d*d*d;
            num/=10;
            
        }
        if (sum==temp) {
            System.out.println("Armstrong num:");
            
        }
    }
    
}
