

public class programm343 {
    public static void main(String[] args) {
        
        int [] Product={101,202,303,404,505};

        int search=505;
        boolean found =false;

        for(int id:Product)
        {
            if(id==search)
            {
                found =true;
                break;
            }
        }
        System.out.println(found?"product found:":"product not found:");
    }
    
}
