package OOPs.Polymorphism;

public class PaymentProcessor {
    public void pay(int amount){
        System.out.println("You payment amount is " + amount);

    }
    public void pay(int amount, int carNumber){
        System.out.println("You amount is " + amount + " and carde number is " + carNumber);
    }
}
