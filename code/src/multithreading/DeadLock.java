package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeadLock {

	public static void main(String[] args) {
		String resource1 = "Kala";
		String resource2 = "Anu";
		Runnable run1 = () -> {
			synchronized (resource1) {
				System.out.println(Thread.currentThread().getName()+" acquire resource "+resource1);
				synchronized (resource2) {
					System.out.println("m1()");
				}
			}
		};
		Runnable run2 = () -> {
			synchronized (resource2) {
				System.out.println(Thread.currentThread().getName()+" acquire resource  "+resource2);
				synchronized (resource1) {
					System.out.println("m2()");
				}
			}
		};
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(run1);
		service.submit(run2);
	}

}
