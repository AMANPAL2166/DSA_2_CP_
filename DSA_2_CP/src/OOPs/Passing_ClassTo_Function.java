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
    }

}
