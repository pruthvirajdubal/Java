public class programm341 {
    public static void main(String[] args) {
        
        int [] Attendence={1,1,0,1,0,1,1};

        int pesent = 0;

        for(int A:Attendence)
        {
            if(A==1)
                pesent++;
        }
        System.out.println("Present="+pesent);
    }
    
}
