public class programm251 {
    public static void main(String[] args) {
        
        int a=12,b=18,i=1,hcf=1;

        while (i<=a && i<=b) {
            
            if(a%i==0 && b%i==0)
                hcf=i;
            i++;
        }
        System.out.println(hcf);
    }
    
}
