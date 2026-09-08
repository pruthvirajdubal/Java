class student
{
    int RollNo;
    String name;
    int marks;
    String city;
    String gender;
}

public class programm382 {

    public static void main(String[] args) {
        
        student sobj =new student();
        sobj.RollNo=101;
        sobj.name="Annna";
        sobj.marks=82;
        sobj.city="mumbai";
        sobj.gender="male";

        
        System.out.println("ROllNO :"+sobj.RollNo);
        System.out.println("NAME :"+sobj.name);
        System.out.println("MARKS :"+sobj.marks);
        System.out.println("CITY :"+sobj.city);
        System.out.println("GENDER  :"+sobj.gender);
       // System.out.println("ROllNO :"+sobj.RollNo);
    }
    
}
