public class programm268 {

    public static void main(String[] args) {
        
        double Amount =6000;

        if(Amount >=5000)
        {
            Amount = Amount -(Amount *0.20);
            System.out.println("20% discount done");
        }
        System.out.println("Final balance:"+Amount);
    }
    
}
