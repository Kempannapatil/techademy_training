package day7;


class TicketCounter {
    private int availableTickets = 5;

    public synchronized void bookTicket(String customerName, int numberOfTickets) {
        if (numberOfTickets <= availableTickets) {
            System.out.println(customerName + " booked " + numberOfTickets + " ticket(s).");
            availableTickets -= numberOfTickets;
            System.out.println("Tickets left: " + availableTickets);
        } else {
            System.out.println("Sorry " + customerName + ", only " + availableTickets + " ticket(s) available.");
        }
    }
}

class BookingThread extends Thread {
    private TicketCounter counter;
    private String customerName;
    private int ticketsToBook;

    public BookingThread(TicketCounter counter, String customerName, int ticketsToBook) {
        this.counter = counter;
        this.customerName = customerName;
        this.ticketsToBook = ticketsToBook;
    }

    public void run() {
        counter.bookTicket(customerName, ticketsToBook);
    }
}
public class Ticketbooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		 TicketCounter counter = new TicketCounter();

	        BookingThread t1 = new BookingThread(counter, "Sanjeev", 2);
	        BookingThread t2 = new BookingThread(counter, "Balesh", 3);
	        BookingThread t3 = new BookingThread(counter, "pruthvik", 1); 
	        t1.start();
	        t2.start();
	        t3.start();
	}

}
