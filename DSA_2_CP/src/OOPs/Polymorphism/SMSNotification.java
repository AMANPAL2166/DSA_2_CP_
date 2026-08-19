package OOPs.Polymorphism;

public class SMSNotification extends  Notifications{
    public void send(String message){
        System.out.println("Your sms notification is " +  message);
    }
}
