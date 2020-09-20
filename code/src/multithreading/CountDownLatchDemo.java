package multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
 * Usecase:-
 * Important Methods:-
 * 1.countDown()
 * 2.await(),await(long,timeunit)
 * 3.getCount()
 * It has only one constructor 
 * public CountDownLatch(int)
 */
public class CountDownLatchDemo {

	public static void main(String[] args) {
		CountDownLatch latch=new CountDownLatch(3);
		Runnable run=()->{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			latch.countDown();
			System.out.println(Thread.currentThread().getName()+" arrived");
		};
		ExecutorService service=Executors.newFixedThreadPool(3);
		service.submit(run);
		service.submit(run);
		service.submit(run);
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("let's go to college");
	}

}
