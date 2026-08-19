package OOPs.Abstraction;

import OOPs.BankAccount;

public class CurrentAccount extends BankAccount {
    public double calculateIntrest() {
        // Calculates 5% interest based on current balance
        return getBalance() * 0.05;
    }
}
