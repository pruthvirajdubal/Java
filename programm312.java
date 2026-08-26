public class programm312 {

    public static void main(String[] args) {
        
        int [][] mark ={

                        {80,75,90},
                        {60,65,70},
                        {95,90,92}
                        
        };
        for(int i=0;i<mark.length;i++)
        {
            int total =0;

            for(int j=0; j<mark[i].length;j++) 
            {
                total +=mark[i][j];
            }
            double avg =total /3.0;

            System.out.println("Student"+(i*1)+"total:"+total+"Avrage:"+avg);
            
        }
    }
    
}
