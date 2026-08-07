public class programm192 {

    public static void main(String[] args) {
        
        int num=12345,count=0;


        // LOGIC*
        for(;num!=0;num/=10) {
            count++;
        }
        System.out.println("DIGIT="+count);
    }
    
}
