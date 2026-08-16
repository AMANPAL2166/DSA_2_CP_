package OOPs;

public class BankAccount {

    private long accountNumber;
    private double balance;
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public  double getBalance(){
        return balance;
    }
    //Deposit :::behavior
    public void deposit(double amount){
        if(amount>0){
            balance+= amount;
            System.out.println("Deposite " + amount);
        }else{
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount <=balance){
            balance -= amount;
            System.out.println("Withdraw "+amount);
        }else {
            System.out.println("Invalid amount or insufficient.");
        }
    }


}
