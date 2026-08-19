package OOPs.Polymorphism;

public class test {
    public static void main(String[] args) {
       /// notification class
        Notifications notiMessage = new Notifications();
        notiMessage.send("This is notification message.");
        Notifications emaiMessage = new EmaiNotification();
        emaiMessage.send("This is email notification message.");
        Notifications smsNotification= new SMSNotification();
        smsNotification.send("This is sms notification message.");

    }
}
