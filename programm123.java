public class programm123 {
    public static void main(String[] args) {
        
        String s="java",rev="";


        for(int i =s.length()-1;i>=0;i--)
            rev+=s.charAt(i);

        
        System.out.print(s.equals(rev));
    }
    
}
