
class Student {
    int RollNo;
    String Name;
    int java;
    int sql;
    int pythone;
    int javascript;
    int golang;
    int cpp;
    
    void Result ()
    {
        int Total =java+pythone+golang+cpp;
        double persentage =Total /4;

        System.out.println("Name:"+Name);
        System.out.println("Total:"+Total);
        System.out.println("Persentage:"+persentage);

        if(persentage >=60)
            System.out.println("First class");

        else if(persentage >=40)
            System.out.println("ONLY PASS");
        else 
            System.out.println("Fail");
    }
}
public class programm360 {

    public static void main(String[] args) {

        Student sobj =new Student();
        sobj.RollNo=101;
        sobj.Name="patil";
        sobj.java=96;
        sobj.sql=76;
        sobj.pythone=82;
        sobj.javascript =87;
        sobj.golang = 55;
        sobj.cpp=87;

        sobj.Result();
    }
    
}
