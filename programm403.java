//Student registation

class Student {

    String name;
    int age;
    String cource;

    // no arguent con

    Student() {
        name="unknoen";
        age=0;
        cource="Not selected";

    }
    void dispaly (){
        System.out.println(name);
        System.out.println(age);
        System.out.println(cource);
    }
}
public class programm403 {
    public static void main(String[] args) {
        
        Student sobj =new Student();
        sobj.dispaly();
    }
    
}
