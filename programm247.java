public class programm247 {
    public static void main(String[] args) {
        
        int num=121,rev=0,temp=num;

        //logic palindrome number
        while (num!=0) {
            rev=rev*10+num%10;
            num/=10;
        }
        if (temp==rev) {
            System.out.println("palindrom");
            
        }
    }
    
}
