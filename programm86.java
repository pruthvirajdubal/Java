public class programm86 {
    public static void main(String[] args) {
        
        String s="java programming";int c=0;

        for(char ch:s.toCharArray())
            if("aeiou".indexOf(ch)!=-1)
                ch++;
            System.out.println(c);
    }
    
}
