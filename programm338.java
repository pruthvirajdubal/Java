
public class programm338 {

    public static void main(String[] args) {
        
        int []salary ={25000,320000,28000,45000,38000};
        int max =salary[0];

        for(int s:salary)
        {
            if(s>max)
            {
                max=s;
              
            }
        }
          System.out.println("Higest salary="+max);
    }
    
}
