public class programm347 {

    public static void main(String[] args) {
        
        int [] salary = {25000,35000,45000,50000,30000};

        int max = salary[0];

        for(int s:salary)
        {

            if(s >max)
            {
                 max =s;
            }
        }
        System.out.println("higest salary:"+max);
    }
    
}
