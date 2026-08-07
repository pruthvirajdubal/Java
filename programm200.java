public class programm200 {

    public static void main(String[] args) {
        
        int a =4,count=0;

        for(int i=1;i<=a;i++) {

            if(a%i==0)
                count++;
        }
        if(count==2)
            System.out.println("PRime");

        else 
            System.out.println("not prime");
    }
}
