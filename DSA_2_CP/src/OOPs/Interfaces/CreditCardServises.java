package OOPs.Interfaces;

public class CreditCardServises  implements PaymentProcessor, notificationCapability{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }

    @Override
    public void printReceipt(double amount) {
        PaymentProcessor.super.printReceipt(amount);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS Notification: " + message);
    }
}
