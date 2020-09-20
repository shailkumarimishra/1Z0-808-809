package multithreading;

public class ThreadSafe{
	public static void main(String[] args) {
		Seat seat= new Seat();
		Runnable run=()->{while(true) {seat.bookTicket(3);}};
		Thread t1=new Thread(run);
		Thread t2=new Thread(run);
		t1.start();
		t2.start();
	}
}
class Seat{
	private static int totalTicket=5;
	public synchronized void bookTicket(int ticket) {
		if(ticket<=totalTicket) {
			totalTicket=totalTicket-ticket;
			System.out.println(ticket+" Ticket is booked");
		}
		
	}
}