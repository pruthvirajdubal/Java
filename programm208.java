public class programm208 {
    public static void main(String[] args) {
        
        int a=12,b=18;
        for(int i=Math.max(a, b);;i++) {

            if(a%i==0 && b%i==0) {
                System.out.println("LCM="+i);
                break;
            }
        }
    }
    
}
