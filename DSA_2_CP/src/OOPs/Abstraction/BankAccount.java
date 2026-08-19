package OOPs.Abstraction;

public abstract class BankAccount {
    private double balance;
    public abstract double calculateIntrest();

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public   void deposite(double amount){
        if(amount>0){
            balance += amount;
        }else{
            System.out.println("Please enter a valid number!");
        }
    }
}
