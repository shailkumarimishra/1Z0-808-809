package multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
//Q. Calculate sum from 1 to 10,000 using 2 threads?
//Q. Producer-Consumer problem using Blocking Queue?
/*
 * Q. Difference b/w ReentrantLock and ReentrantReadWriteLock?
 * Ans:- 1.ReentrantLock one thread at a time but in ReentrantReadWriteLock one writer thread 
 * 		  at a time or multiple reader threads at a time. 
 * Q. Difference b/w Synchronized and Lock?
 * Ans:- 1. Synchronized is implicit lock but Lock is explicit lock.
 * 		 2. Synchronized does not have API's but Lock has many API.
 * 		 3. Synchronized does not allow locking , unlocking in any scopes and in any order
 * 			but Lock allows.
 * 1. Parallelism:- Parallelism is about doing a lot of things at once.
 * 2. Concurrency:- Concurrency is about dealing a lot of things at once. Shared resources
 * 					is to be accessed or update. In other words, multiple task need to be 
 * 					coordinate. 
 *  Q. Difference b/w Runnable and Callable?
 *  Ans:- 1. Runnable is available in java.lang package but Callable<> is available in 
 *  		 java.util.concurrent package.
 *  	  2. Runnable has only one abstract method run() and Callable has only one abstract
 *  		 method call().
 *  	  3. run() does not return anything but call() returns something in the form of 
 *  		 Future.
 *  		 
 */
public class MyQueue2 {
	private Queue<String> queue;
	private int max = 16;
	private ReentrantLock lock = new ReentrantLock();
	private Condition notEmpty = lock.newCondition();
	private Condition notFull = lock.newCondition();
	private ReadWriteLock lock1=new ReentrantReadWriteLock();
	public MyQueue2(int max) {
		super();
		this.max = max;
		this.queue = new LinkedList<>();
	}

	public void put(String item) {
		lock.lock();
		try {
			while (queue.size() == max) {
				notFull.await();
			}
			queue.add(item);
			notEmpty.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		Lock readLock = lock1.readLock();
		Lock writeLock = lock1.writeLock();
	}

	public  String take() {
		lock.lock();
		String item = null;
		try {
			while (queue.size() == 0) {
				notEmpty.await();
			}
			item = queue.remove();
			notFull.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		return item;
	}

}
