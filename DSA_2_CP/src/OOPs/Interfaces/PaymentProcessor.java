package OOPs.Interfaces;

public interface PaymentProcessor {
    //Abstract method(Implicitly public abstract)
    void processPayment(double amount);
    //Default method (Java 8+) -keeps existing code working implementation
    default void printReceipt(double amount){
        System.out.println("Reciept payment of " + amount + "processed successfully.");
    }
    //Static method (Java 8+) utility function scoped to the interface
    static boolean validateAmount(double amount){
        return amount>0;
    }
}
