public class programm314 {

    public static void main(String[] args) {
      
 
        int [] salary ={50000,75000,45000,90000,80000};

        int highest =Integer.MIN_VALUE;
        int Secondhigh=Integer.MIN_VALUE;

        for(int i=0;i<salary.length;i++)
        {
            if(salary[i] >highest)
            {
                Secondhigh=highest;
                highest=salary[i];
            }
            else if(salary[i]>Secondhigh && salary[i]!=highest)
            {
                Secondhigh=salary[i];
            }
        }
        System.out.println("Higest salary:"+highest);
        System.out.println("Second hgh salary:"+Secondhigh);
    }

}