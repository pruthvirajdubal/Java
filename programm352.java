
 public class programm352 {
    public static void main(String[] args) {
        
        int []arr ={10,20,30,40,50};

        int Largest =Integer.MIN_VALUE;
        int Second =Integer.MIN_VALUE;

        for (int a:arr)
        {
            if(a>Largest)
            {
                Second =Largest;
                Largest =a;
            }
            else if (a> Second && a!=Largest)
            {
                Second =a;
            }
        }
        System.out.println("Second Largest:"+Second);
    }
 
    
 }