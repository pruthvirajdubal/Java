public class programm230 {
    public static void main(String[] args) {
        
        String s="java";
        int count=0;

        for(int i=0;i<s.length();i++) {
            if("aeiou".indexOf(s.charAt(i))!=-1)
                count++;
        }
        System.out.println(count);
    }
    
}
