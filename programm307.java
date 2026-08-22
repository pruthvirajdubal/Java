public class programm307 {

    public static void main(String[] args) {
        
        int [] salary ={25000,52000,38000,75000,45000};
        
        int highest =salary[0];

        for(int i=0;i<salary.length;i++)
        {
            if (salary[i]>highest)
            {
                highest =salary[i];     
            }
        }
        System.out.println("Higest salry:"+highest);
    }
}
