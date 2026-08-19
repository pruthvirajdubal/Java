public class programm252 {
    public static void main(String[] args) {
        
        int a=12,b=18,i=Math.max(a, b);

        //LCM LOGIC
        while (true) {
            if (i%a==0 && i%b==0) {
                System.out.println(i);
                break;
                
            }
            i++;
        }
    }
    
}
