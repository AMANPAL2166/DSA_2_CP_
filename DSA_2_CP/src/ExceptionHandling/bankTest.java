package ExceptionHandling;

public class bankTest {
    public static void main(String[] args) {
        BankAccount aman = new BankAccount(10000);
        try{
            aman.withdraw(10000);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Transaction completed."+ " Your current balance is " + aman.getBalance());
        }
    }
}
