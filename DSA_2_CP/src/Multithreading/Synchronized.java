package Multithreading;

public class Synchronized {
     static class TicketBooking{
        int availableSeats = 1;
         void bookTicket(String user){
            synchronized(this){
                if(availableSeats > 0) {
                    System.out.println(user + " found a seat!");
                    availableSeats--;
                    System.out.println("Dear user " + user + ". Your ticket has been confirmed!");
                }else{
                    System.out.println(user + ".....Dear user "+"NO seat is available.");
                }
            }
        }
    }

    public static void main(String[] args) {
        TicketBooking booking =new TicketBooking();
        Thread t1 = new Thread(()->{
            booking.bookTicket("Aman");
        });
        Thread t2 = new Thread(()->{
            booking.bookTicket("Rahul");
        });
        t2.start();
        t1.start();
        /// Output
        //Aman found a seat!
        //Rahut found a seat!
        //Dear user Aman. Your ticket has been confirmed!
        //Dear user Rahut. Your ticket has been confirmed!
        ///  -- but available ticket was 1.....now we make synchronized method
        ///  Output
        // Rahul found a seat!
        //Dear user Rahul. Your ticket has been confirmed!
        //Aman.....Dear user NO seat is available.
        ///  Now we try synchronized block to overcome extra load.
//        Rahul found a seat!
//        Dear user Rahul. Your ticket has been confirmed!
//        Aman.....Dear user NO seat is available.

    }
}
