package OOPs;

public class Passing_ClassTo_Function {

    static class Student {
        String name;
        int marks;

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }
    }

    // Method that takes Student object and just prints it
    static void printStudent(Student s) {
        System.out.println("Name: " + s.name + ", Marks: " + s.marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 90);
        printStudent(s1);
        Counter c1 = new Counter(88);
        System.out.println(c1.value);
    }
    //second class;
    static class Counter{
        int value;
        Counter(int value){
            this.value = value;
        }
    }
    class Main2{
        //method that change the state of the same object;
        static void increment(Counter c){
            c.value++;

        }

        public static void main(String[] args) {
            Counter c1 = new Counter(5);
            System.out.println("Before:  " + c1.value);
            increment(c1);
            System.out.println("After: " + c1.value);


        }
    }

}
