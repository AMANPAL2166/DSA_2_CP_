package OOPs.Abstraction;

public class test {
    public static void main(String[] args) {
        //

        // Abstract parent references pointing to specific child objects
        BankAccount accout1 = new SavingAccount() {
            @Override
            public double calculateIntrest() {


            }
        };
        BankAccount account2 = new CurrentAccount();

        // Deposit money into both
        accout1.deposite(1000.0);
        account2.deposite(1000.0);

        // Run-time polymorphism calculates interest dynamically
        System.out.println("Savings Account Interest: $" + savings.calculateIntrest()); // Outputs $50.0
        System.out.println("Current Account Interest: $" + current.calculateIntrest()); // Outputs $0.0
    }
}
