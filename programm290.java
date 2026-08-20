public class programm290 {

    public static void main(String[] args) {
        
        String role ="DEVELOPER";

        switch (role) {
            case "ADMIN":
                System.out.println("ful system Access:");
                break;
             
            case "manager":
                System.out.println("Empployee manger Acess:");
                break;    
        
            case "DEVELOPER":
                System.out.println("Empolyee developer Access");
                break;
                
             case "tester":
                System.out.println("Employee tester Access:");   
            default:
                System.out.println("Access Denied:");;
        }
    }
}
