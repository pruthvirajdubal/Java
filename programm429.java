//notification system
class Notification 
{
    void send(String massage)
    {
        System.out.println("sending Notification..");
    }
}
class EmailNotification extends Notification
{
    @Override

    void send(String massage)
    {
        System.out.println("Email:"+massage); 
    }
}
class SMSNotification extends Notification
{
    @Override

    void send(String massage)
    {
        System.out.println("SMS:"+massage);
    }
}
class WhatsAppnotification extends Notification
{
    @Override
    void send (String massage)
    {
        System.out.println("WhatsApp:"+massage);
    }
}


public class programm429 {
    public static void main(String[] args) {

        Notification nobj;

        nobj = new EmailNotification();
        nobj.send("Ordrer confirm");

        nobj = new SMSNotification();
        nobj.send("otp:1234");

        nobj = new WhatsAppnotification();
        nobj.send("your order is deliiver...");
        
    }
    
}
