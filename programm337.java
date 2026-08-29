public class programm337 {

    public static void main(String[] args) {
        
        int [] marks ={78,75,88,67,92};

        int sum =0,higest=marks[0];

        for(int mark: marks)
        {
            sum+=mark;

            if(mark >higest)
            
                higest =mark;
            
        }
        System.out.println("Avrage:"+(sum/marks.length));
        System.out.println("Hihest:"+higest);

    }
    
}
