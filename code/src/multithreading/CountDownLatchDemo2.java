package multithreading;

import java.util.concurrent.CountDownLatch;
/*
 * Q. Suppose there are 4 Threads t1, t2, t3, t4. Write code that t1, t2 will be executed 
 * 	first and only after they finished t3 and t4 will start executing and main thread will
 * 	start executing after t3, t4 ?
 */
public class CountDownLatchDemo2 {

	public static void main(String[] args) {
		CountDownLatch latch=new CountDownLatch(3);
		Thread t1=new Thread(new Student(latch,1000),"shail");
		Thread t2=new Thread(new Student(latch,2000),"kala");
		Thread t3=new Thread(new Student(latch,3000),"anu");
		t1.start();
		t2.start();
		t3.start();
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("let's celebrate maasi shaadi");
	}

}
class Student implements Runnable{
private	CountDownLatch latch;
private long duration;

	public Student(CountDownLatch latch, long duration) {
	super();
	this.latch = latch;
	this.duration = duration;
}

	@Override
	public void run() {
		try {
			Thread.sleep(duration);
			System.out.println(Thread.currentThread().getName());
			latch.countDown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}