import java.util.Scanner;

/**
 * Student Result persentage
 */
class Student {
    int rollNo;
    String name;
    int java;
    int sql;
    int spring;

    Student(int rollNo,String name,int java,int sql,int spring)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.java=java;
        this.sql=sql;
        this.spring=spring;
    }

    void Result() 
    {
      int TOtal=java +sql+spring;
      double persentage = TOtal/3.0;

      System.out.println("NAME :"+name);
      System.out.println("TOtal:"+TOtal);
      System.out.println("PERSENTAGE:"+persentage);

        if(java >=40 && sql >=40 && spring >=40)
        {
            System.out.println("Rasule pass:");
        }else
        {
            System.out.println("Result:Faill..");
        }
    }  
}
public class programm410 {

    public static void main(String[] args) {
        
        Scanner sobj =new Scanner(System.in);

        System.out.println("ROLLNO:");
        int rollNo=sobj.nextInt();

        System.out.println("JAVA:");
        int java=sobj.nextInt();

        System.out.println("SQL:");
        int sql=sobj.nextInt();

        System.out.println("Spring:");
        int spring=sobj.nextInt();

        Student s =new Student(rollNo, null, java, sql, spring);

        s.Result();



    }
    
}