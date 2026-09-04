public class programm353 {
    public static void main(String[] args) {
        
        int [] [] marks ={

                         {80,75,90},
                         {70,85,88},
                         {92,90,95}
        };

        for(int i=0;i<marks.length;i++)
        {
            int Total =0;

            for(int j=0;j<marks.length;j++)
            {
                Total +=marks[i][j];
            }
            System.out.println("Student"+(i+1)+"Total:"+Total);
        }
    }
    
}
