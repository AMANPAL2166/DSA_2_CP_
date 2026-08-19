package OOPs.Polymorphism;

public class Animal {
    public void sayHello(){
        System.out.println("Animal make a sound....");
    }
    // Child Class 1
    static class Dog extends Animal {
        @Override
        public void sayHello() {
            System.out.println("Woof! Woof!");
        }
    }

    // Child Class 2
     static class Cat extends Animal {
        @Override
        public void sayHello() {
            System.out.println("Meow!");
        }
    }
}
