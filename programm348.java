
public class programm348 {
    public static void main(String[] args) {

        double [] price = {499.99,455.00,256.96,896.98};

        double max =price[0];

        for (double p:price)
        {
            if(p >max)
            {
                max =p;
            }
        }
        System.out.println("Most Expansive:"+max);
        
    }
    
}
