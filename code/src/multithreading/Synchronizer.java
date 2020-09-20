package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/*
 * Important methods of semaphore:-
 * 1. acquire()
 * 2.release()
 * 3.tryAcquire()
 * 4.availablePermits()
 * It has 2 constructor:-
 * public Semaphore(int)
 * public Semaphore(int,boolean)
 * use of semaphore:- 
 */
public class Synchronizer {

	public static void main(String[] args) {
		Semaphore semaphore=new Semaphore(3);
		System.out.println(semaphore.availablePermits());
		Runnable run=()->{
			try {
				semaphore.acquire();
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		ExecutorService service=Executors.newFixedThreadPool(6);
		service.submit(run);
		service.submit(run);
		service.submit(run);
		service.submit(run);
//		System.out.println(semaphore.availablePermits());
		service.submit(run);
		service.submit(run);
//		System.out.println(semaphore.availablePermits());
	}

}
