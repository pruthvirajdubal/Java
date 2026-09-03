public class programm350 {
    public static void main(String[] args) {
        
        int [] product ={101,102,103,104,505,10001};

        int search =10001;
        boolean found =false;

        for(int p: product)
        {
            if(p==search)
            {
                found =true;
                break;
            }
        }
        System.out.println(found?"product found":"product not found:");
    }
    
}
