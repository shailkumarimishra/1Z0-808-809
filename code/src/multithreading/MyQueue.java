package multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
	private Queue<String> queue;
	private int max = 16;

	public MyQueue(int max) {
		super();
		this.max = max;
		this.queue = new LinkedList<>();
	}

	public synchronized void put(String item) {
		while (queue.size() == max) {
//	wait
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		queue.add(item);
//	notify consumer
		notifyAll();

	}

	public synchronized String take() {
		while (queue.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		String item = queue.remove();
//	notify producer
		notifyAll();
		return item;
	}
}
