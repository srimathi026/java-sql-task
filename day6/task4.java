class TicketBooking {
    private int availableSeats = 5;

    
    public synchronized void bookTicket(String userName, int seatsRequested) {
        System.out.println(userName + " is trying to book " + seatsRequested + " seat(s)...");

        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            System.out.println(userName + " was interrupted.");
        }

        if (seatsRequested <= availableSeats) {
            availableSeats -= seatsRequested;
            System.out.println(userName + " successfully booked " + seatsRequested + " seat(s).");
        } else {
            System.out.println(userName + " could not book " + seatsRequested + " seat(s). Only " + availableSeats + " seat(s) available.");
        }

        System.out.println("Remaining seats: " + availableSeats + "\n");
    }
}

class User extends Thread {
    private String userName;
    private int seatsToBook;
    private TicketBooking bookingSystem;

    public User(String userName, int seatsToBook, TicketBooking bookingSystem) {
        this.userName = userName;
        this.seatsToBook = seatsToBook;
        this.bookingSystem = bookingSystem;
    }

    public void run() {
        bookingSystem.bookTicket(userName, seatsToBook);
    }
}

public class CombinedBookingApp {
    public static void main(String[] args) {
        TicketBooking bookingSystem = new TicketBooking();

        
        User u1 = new User("Alice", 2, bookingSystem);
        User u2 = new User("Bob", 1, bookingSystem);
        User u3 = new User("Charlie", 3, bookingSystem); // May fail if not enough seats
        User u4 = new User("Diana", 1, bookingSystem);

        
        u1.start();
        u2.start();
        u3.start();
        u4.start();

     
        try {
            u1.join();
            u2.join();
            u3.join();
            u4.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All booking attempts finished.");
    }
}
