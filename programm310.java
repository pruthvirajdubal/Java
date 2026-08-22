/**
 * programm310
 */
public class programm310 {

    public static void main(String[] args) {
        
        String [] Attempt ={"worng","worng","coorect","wrong","wrong"};

        int failedAttempt=0;

        for(int i=0;i<Attempt.length;i++)
        {
            if(Attempt[i].equals("worng"))
            {
                failedAttempt++;
            }
            if(Attempt[i].equals("coorect"))
            {
                System.out.println("Login succesful...");
                break;
            }
        }
        System.out.println("Final Attempt:"+failedAttempt);
    }
}