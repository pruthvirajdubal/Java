public class programm301 {

    public static void main(String[] args) {
        
        int leaveDays=4;
        int remainingDay=10;

        if(leaveDays>0 && leaveDays<=remainingDay)
        {
            remainingDay-=leaveDays;
            System.out.println("Leave Approved:");
        }
        else
        {
            System.out.println("Leave Rejected:");
        }
    }
    
}
