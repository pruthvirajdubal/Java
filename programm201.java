public class programm201 {

    public static void main(String[] args) {
        
        //  PRINT ALL PRIME NUMBER 1 TO 50

        for(int i=1;i<=50;i++) {
            int count=0;

            for(int j=1;j<=i;j++) {
                if(i%j==0)
                    count++;
            }
            if(count==2)
                System.out.print(i);
        }
    }
    
}
