public class programm355 {
    public static void main(String[] args) {
        
        int[][] salaries ={
                         
                            {30000,35000,40000},
                            {45000,50000,55000},
                            {25000,28000,32000}
        };

        for(int i=0;i<salaries.length;i++)
        {
            int Total =0;
            for(int s :salaries[i])
            {
                Total +=s;
            }
            System.out.println("Department"+(i+1)+"Total:"+Total);
        }
    }
    
}
