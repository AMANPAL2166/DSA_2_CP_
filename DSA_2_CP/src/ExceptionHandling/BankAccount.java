package ExceptionHandling;

public class BankAccount {


    private double balance;
    BankAccount(double balance){
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    //Instance method
    void withdraw(double amount){
        if(balance <= 0){
            throw  new IllegalArgumentException(
                    "For withdraw money, balance should be in positive."
            );
        }
        if(amount > balance){
            throw new IllegalArgumentException(
                   "Your amount is greater then your current balance."
            );
        }
        balance -= amount;
    }
}
