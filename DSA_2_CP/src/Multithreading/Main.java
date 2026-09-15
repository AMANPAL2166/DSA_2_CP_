package Multithreading;

public class Main extends Thread {
    @Override
//    public void run(){
//        System.out.println("Task running.....");
//    }
    //run 2 thered concurently
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }

    public static void main(String[] args) {

        myTask task = new myTask();
        Thread t = new Thread(task);
        t.start();



    }

    ///  Here is a problem in extend thead, as we all know java accept single extend class.
    ///   This is the problem.What if we need to access another call in future???We can't do this.
    ///  That's why here runnable come in action to solve our problem.

    static class myTask implements Runnable{

        @Override
        public void run() {
            System.out.println("Task running.......");
        }
    }


}