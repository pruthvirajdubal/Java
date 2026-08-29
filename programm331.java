public class programm331 {

    public static void main(String[] args) {

    char Signal ='Y';

    switch(Signal) {

        case 'R':
            System.out.println("Stop");
            break;

        case 'Y' :
            System.out.println("Ready");
            break;
        case 'G' :
            System.out.println("GO");
            break;

        default:
            System.out.println("Invalid Signal..");
    }
    


    }
}
