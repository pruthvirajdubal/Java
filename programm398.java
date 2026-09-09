public class programm398 {
     
    class StudentGrade {

        static char calculateGrade(
                        String name ,
                        int roolNo,
                        int java,
                        int sql,
                        int spring
        )
        { 
            int Total =java+sql+spring;

            double persentage =Total/3.0;

            char grade;

            if(persentage >=90)
            {
                grade='A';
            }
            else if(persentage >=75)
            {
                grade='B';
            }
            else if(persentage>=60)
            {
                grade='C';
            }
            else if (persentage>=40)
            {
                grade='D';
            }
            else 
            {
                grade='F';
            }
            System.out.println("Name :"+name);
            System.out.println("ROLL :"+roolNo);
            System.out.println("Persentage :"+persentage);
            System.out.println("Grade :"+grade);

            return grade;
    }
    public static void main(String[] args) {

            StudentGrade sgobj =new StudentGrade();
            sgobj.calculateGrade("pruthvi", 101, 85, 90, 71);
        System.out.println("Return :"+grade);
            



    } 
    }
    
}
