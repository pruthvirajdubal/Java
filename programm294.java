public class programm294 {

    public static void main(String[] args) {
        
        double orderamount =7500;
        double discount;

        if(orderamount>=10000)
        {
            discount =orderamount *0.20;
        }
        else if(orderamount >=5000)
        {
            discount=orderamount *0.10;
        }
        else if (orderamount >=2000)
        {
            discount =orderamount *0.05;
        }
        else 
        {
            discount =0;
        }
        double finalamount =orderamount - discount;
        System.out.println("Discount:"+discount);

        System.out.println("Final Amount :"+finalamount);
    }
    
}
