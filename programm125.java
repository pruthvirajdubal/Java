public class programm125 {

    public static void main(String[] args) {
        String s="madam" ,rev="";

        for(int i=s.length();i>=0;i--)
            rev+=s.charAt(i);

        System.out.println(s.equals(rev));
    }
    
}
