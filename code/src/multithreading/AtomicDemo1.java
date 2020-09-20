package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo1 {
	

	public void evenOdd() {
	 AtomicInteger atomic =  new AtomicInteger(1);
		Runnable run = () -> {
			while (atomic.get() < 10) {
				synchronized (this) {
					if (atomic.get() % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
						System.out.println("odd thread " + atomic.getAndIncrement());
					} else if (atomic.get() % 2 == 0 && Thread.currentThread().getName().equals("even")) {
						System.out.println("even thread " + atomic.getAndIncrement());
					}
				}
			}
		};
		Thread t1 = new Thread(run, "odd");
		Thread t2 = new Thread(run, "even");
		t1.start();
		t2.start();

	}

	public static void main(String[] args) {
		 AtomicInteger atomic =  new AtomicInteger(1);
			Runnable run = () -> {
				while (atomic.get() < 10) {
					synchronized (atomic) {
						if (atomic.get() % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
							System.out.println("odd thread " + atomic.getAndIncrement());
						} else if (atomic.get() % 2 == 0 && Thread.currentThread().getName().equals("even")) {
							System.out.println("even thread " + atomic.getAndIncrement());
						}
					}
				}
			};
			Thread t1 = new Thread(run, "odd");
			Thread t2 = new Thread(run, "even");
			t1.start();
			t2.start();
	}
	}

