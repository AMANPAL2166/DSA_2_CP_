package Fundamental;

public class Object_and_memory {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Classy";
        p1.age = 33;
//        p1.sayHi();
        Person p2 = new Person();
        p2.name = "Shreyash";
        p2.age = 19;
//        p2.sayHi();
        p1.sayHi();
        p2.sayHi();
        swap1(p1,p2);
        p1.sayHi();
        p2.sayHi();


    }

    public static class Person{
        int age ;
        String name;
        void sayHi(){
            System.out.println(name + ", I'm " +age+ "year old.");
        }

    }

    public static void swap(Person p1,  Person p2) {
        Person temp = p1;
        p1 = p2;
        p2 = temp;
    }

    public static void swap1(Person p1,  Person p2) {
       p1 = new Person();
        int age = p1.age;
        p1.age = p2.age;
        p2.age = age;

        p2 = new Person();
        String name = p1.name;;
        p1.name = p2.name;
        p2.name  = name;

    }
}
