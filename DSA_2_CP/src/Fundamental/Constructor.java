package Fundamental;

public class Constructor {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 22;
        p1.name  = "Shhubhu";
        p1.saysHi();
        Person p2 = new Person(33, "Aman");
        p2.saysHi();


    }

    public static class  Person {
        int age;
        String name;
        void saysHi(){
            System.out.println(name + "[" + age + "] say Hii!!" );

        }
        // if we forget, java provide our class a default constructor
        Person(){
            //constructor

        }
        //Parametrized constructor
        Person(int age, String name){
            this.age = age;
            this.name = name;

        }

    }
}
