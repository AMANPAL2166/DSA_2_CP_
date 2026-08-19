package OOPs.Polymorphism;

public class EmaiNotification extends Notifications{
    public  void send(String message){
        System.out.println("Yout email notification is " + message);
    }
}
