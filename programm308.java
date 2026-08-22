public class programm308 {
/*
TOTAL OF ALL PRICE */
    public static void main(String[] args) {
        
        double [] price ={499.99,299.50,1500.00,799.00};

        double total =0;

        for(int i =0;i<price.length;i++)
        {
            total =total+price[i];
        }
        System.out.println("total Price:"+total);
    }
    
}
