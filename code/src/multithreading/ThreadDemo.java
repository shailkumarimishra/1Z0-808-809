package multithreading;
/*
 * Multiprogramming
 * Multitasking:- 1.Process based Multitasking:-OS based.
 * 				  2. Thread based multitasking:- related to any programming language.
 * Multithreading
 * Process:- Program under execution (reside in physical memory ram or main memory)
 * 			 It occupied the CPU  to execute the execution.
 * 		Attributes of Process:-
 * 		1. ProcessID
 * 		2.Process State
 * 		3.Program counter
 * 		4.Priority
 * 
 * Thread:- It is a light weight process.
 * Starvation
 * Deadlock
 * Concurrency
 * Parallelism
 * Context-Switching:- Saving the context (instruction) of one process and 
 * 					   loading the context of another process.
 * 
 * CPU scheduler
 * CPU Scheduler Algorithm
 * Responsiveness(Latency):-Request given Response received means good latency.
 * 							If more time taken to give Response means poor Latency.
 * 
 * Resource Sharing:- Resource(code,data,file,memory,stack,register,CPU).
 * 					  The Resources like code,data and memory(RAM) will be shared among all
 * 					  the thread.But in thread every thread has its own stack.
 * Q1. How can we create thread in java?
 * Ans:- There are 3 ways we can create a thread:-
 * 		1.By Extending Thread Class(java.lang.Thread)
 * 		2.By Implementing Runnable interface(java.lang.Runnable)
 * 		3.By Implementing Future interface.(java.util.concurrent.Future)
 */
public class ThreadDemo extends Thread {
 public void run() {
	 for(int i=0;i<10;i++) {
		 System.out.println(Thread.currentThread().getName()+" "+i+" "+Thread.currentThread().getPriority());
	 }
 }
}
