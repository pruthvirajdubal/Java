public class programm124 {

    public static void main(String[] args) {
        
        String s="gopal",rev="";

        for(int i=s.length()-1;i>=0;i--)
            rev+=s.charAt(i);

        System.out.print(rev);
    }
}
