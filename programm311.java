public class programm311 {

    public static void main(String[] args) {
        
        int [] product ={101,205,301,101,450,205};

        for(int i=0;i<product.length;i++)
        {
            for(int j=i+1;j<product.length;j++)
            {
                if(product[i]==product[j])
                {
                    System.out.println("Duplicate product id:"+product[i]);
                }
            }
        }
    }
    
}
