class student
{
    static void CalculateResult(String name,int java,int sql, int spring)
    {
        int Total =java+sql+spring;
        double pre =Total /3.0;

        System.out.println("Student :"+name);
        System.out.println("Total :"+Total);
        System.out.println("persentage :"+pre);
    }
    
}

public class programm390 {

    public static void main(String[] args) {
         
        student.CalculateResult("Rahul", 80, 78, 63);
    }
    
}
