package multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

public class MyQueue3 {
	public static void main(String[] args) {
		 BlockingQueue<String> queue=new ArrayBlockingQueue<>(4);
		Runnable producer=()->{
			while(true) {
				try {
					queue.put("item");
					System.out.println(Thread.currentThread().getName()+" produce an item");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t1=new Thread(producer,"anjali");
		Thread t2=new Thread(producer,"shradha");
		t1.start();
		t2.start();
		Runnable consumer=()->{
			while(true) {
				try {
					String item = queue.take();
					System.out.println(Thread.currentThread().getName()+" consume an "+item);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t3=new Thread(consumer,"anu");
		t3.start();
	}
}
