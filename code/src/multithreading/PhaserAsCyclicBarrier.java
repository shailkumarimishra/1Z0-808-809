package multithreading;

import java.util.concurrent.Phaser;
/*
 * UseCase:-
 *Important Methods:-
 *1.awaitAdvance(int)// This method we can use instead of CountDownLatch await()
 *2.arrive()// This method we can use instead of CountDownLatch countDown()
 *3.arriveAndAwaitAdvance()// This method we can use instead of CyclicBarrier await()
 *4.bulkRegister(int)
 *5.arriveAndDeregister();
 */
public class PhaserAsCyclicBarrier {

	public static void main(String[] args) {
		Phaser phaser = new Phaser(3);
		Thread t1 = new Thread(new Passenger1(phaser, 1000), "kala");
		Thread t2 = new Thread(new Passenger1(phaser, 2000), "shradha");
		Thread t3 = new Thread(new Passenger1(phaser, 3000), "anjali");
		Thread t4 = new Thread(new Passenger1(phaser, 2000), "ambe");
		Thread t5 = new Thread(new Passenger1(phaser, 3000), "bhaiya");
		Thread t6 = new Thread(new Passenger1(phaser, 4000), "maasi");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		phaser.bulkRegister(2);
	

	}
}

class Passenger1 implements Runnable {
	private Phaser phaser;
	private long duration;

	public Passenger1(Phaser phaser, long duration) {
		super();
		this.phaser = phaser;
		this.duration = duration;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(duration);
				System.out.println(Thread.currentThread().getName() + " is arrived");
//				System.out.println("------"+phaser.getArrivedParties());
				int await = phaser.arriveAndAwaitAdvance();
				if(phaser.getArrivedParties()==0) {
					System.out.println("Anu gaadi chalu kr"+" "+phaser.getPhase());
				}
//				System.out.println(await+"------"+phaser.getArrivedParties());
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
