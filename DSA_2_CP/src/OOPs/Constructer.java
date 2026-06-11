package OOPs;

public class Constructer {
    /// Constructor is basically a special member of java that is called when an object is created.
    /// Constructor has a same name as class.
    /// they have no return and void type.
    /// It can accept parameter to initialize object properties.
    // Types of constructer
        //1: Default constructor
        //2: Parametrized Constructor
        //3: Private constructor
        //4: Copy Constructor

     static class Const{
         Const(){
             System.out.println("Empty constructor.");
         }
         void display(){
             System.out.println("Full of joy!!");
         }

     }
     ///  Let's start with default constructor
     static class Geek{
         Geek(){
             System.out.println("Its default constructor object.");
         }
     }
     /// Now, it's a parametrized constructor
     static class Para{
         String name;
         int age;
         Para(String name,int age ){
             this.name = name;
             this.age = age;
         }
         void display(){
             System.out.println("Para Name: " + this.name +":::: " +"Para age: " + this .age);
         }
     }
     ///  copy constructor
     static class Copy{
         String name;
         int age;
         Copy(String name, int age){
             this.name = name;
             this.age = age;
         }
         Copy(Copy obj){
             this.name = obj.name;
             this.age = obj.age;
         }
     }

    public static void main(String[] args) {
        Const s = new Const( );
        s.display();
        //Default constructor object
        Geek g = new Geek();
        //Parametrized constructor
        Para p = new Para("Aman", 33);
        p.display();
        // Copy constructor
        Copy  cp  = new Copy("Rohit ",33);




    }
}
