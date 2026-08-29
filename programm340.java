public class programm340 {
    public static void main(String[] args) {
        
        int [] prices={500,1200,800,2500,1500};

        int count =0;

        for(int price:prices)
        {
            if(price >1000)
                count++;
        }
        System.out.println("Product Above 1000="+count);
    }
    
}
