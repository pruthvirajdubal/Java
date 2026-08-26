public class programm313 {

    public static void main(String[] args) {
        
        int Amount =2870;

        int [] notes ={500,200,100,50,20,10};

        for(int i=0;i<notes.length;i++)
        {
            int count =Amount /notes[i];

            if(count>0)
            {
                System.out.println(notes[i]+"X"+count);

                Amount =Amount %notes[i];
            }
        }
    }
    
}
