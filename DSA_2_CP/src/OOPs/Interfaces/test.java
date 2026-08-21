package OOPs.Interfaces;

public class test {
    public static void main(String[] args) {
//        double amount = 150.0;
//
//        // Calling a Static method directly on the Interface
//        if (PaymentProcessor.validateAmount(amount)) {
//            CreditCardServises cardService = new CreditCardServises();
//
//            // Overridden abstract methods
//            cardService.processPayment(amount);
//            cardService.sendNotification("Transaction approved for $" + amount);
//
//            // Default method inherited from PaymentProcessor
//            cardService.printReceipt(amount);
//        }
        String network = "AmanWifi";
        // 1. Call static method directly on the Interface
        if (WifiConnectable.isValidNetwork(network)) {

            // 2. Instantiate the concrete class
            SmartTv tv = new SmartTv();

            // 3. Invoke implemented interface methods
            tv.connectToWifi(network);
            tv.turnOn();
            tv.turnOff();
        } else {
            System.out.println("Invalid Wi-Fi network!");
        }
    }
}
