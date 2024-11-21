package com.aspiresys;

//Parent class (Ticket)
class Ticket {
 String ticketNumber;
 
 public Ticket(String ticketNumber) {
     this.ticketNumber = ticketNumber;
 }
 
 // Method to be overridden
 public void bookTicket() {
     System.out.println("Booking ticket with ticket number: " + ticketNumber);
 }
}

//Child class (ConcertTicket)
class ConcertTicket extends Ticket {
 public ConcertTicket(String ticketNumber) {
     super(ticketNumber);
 }
 
 // Overriding bookTicket method for ConcertTicket
 @Override
 public void bookTicket() {
     System.out.println("Booking concert ticket with ticket number: " + ticketNumber);
 }
}



class Main {
	  public static void main(String[] args) {
	        // Create objects of different ticket types
	        Ticket ticket1 = new ConcertTicket("C123");
	       

	        // Booking tickets using the common method
	        ticket1.bookTicket();  // Output: Booking concert ticket with ticket number: C123
	    
	    }

}
