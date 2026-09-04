public class programm354 {
    public static void main(String[] args) {
        
        int [][] setes = {

                 {1,1,0,1},
                 {1,0,0,1},
                 {1,1,1,0}
        };
        int available = 0;

        for (int[]row :setes)
        {
            for(int s:row)
            {
                if(s==0)
                {
                    available++;
                }
            }

        }
        System.out.println("Avilable seates:"+available);
    }
    
}
