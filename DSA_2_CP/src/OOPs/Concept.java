package OOPs;

public class Concept {
    public static void main(String[] args) {
        //make blueprint of car object
        Car car = new Car();
        car.model= "Skoda slaviya";
        car.name = "Sedan";
       // car.year = 2025;// we can't directly becoz its encapsulated
        car.setYear(2026);
        System.out.println(car.getYear());
        //make a object of dog
        Dog dog = new Dog();
        dog.eat = "Non-veg";
        dog.speak = "Bawww";
        dog.bread = "kally";

        //create object using poly parent class to child class
        Animal kalluu = new Dog();
        //Bank account
        BankAccount newAcc = new BankAccount();
        newAcc.setAccountNumber(933607);
        System.out.println("YOUr account number is: "+newAcc.getAccountNumber());
        newAcc.deposit(30);
        System.out.println(newAcc.getBalance());
        newAcc.withdraw(40);
        System.out.println(newAcc.getBalance());
        newAcc.withdraw(30);
        System.out.println(newAcc.getBalance());


    }
}
