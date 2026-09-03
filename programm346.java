public class programm346 {

    public static void main(String[] args) {
        
        int[] marks ={78,85,92,67,99};

        int Total=0;

        for(int m:marks)
        {
            Total +=m;
        }
        double Avrage =(double) Total / marks.length;

        System.out.println("TOtal:"+Total);
        System.out.println("Avrage:"+Avrage);
    }
}
