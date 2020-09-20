package multithreading;
//Q1. Why wait(), notify(), notifyAll() are in Object class not in Thread class?
//Q2. What is race condition?
//Q3. What is data race?
//Q4. Difference between join,sleep,wait, notify, notifyAll?
//Q5. How can you acquire lock on class level?
/* 
   suppose there are 4 threads t1,t2,t3,t4 and 2 static methods (m1,m2) having lock at
   class level, 2 instance methods (m3,m4) having lock at object level and 
   2 normal methods(m5 static,m6 non-static)
   
   Case1:-
   suppose t1 & t2 want to execute m1() & m2() respectively, is it possible that t1 & t2 
   execute m1() & m2() simultaneously or not?
   Ans:- NO
   
   Case2:- 
   suppose t1 & t2 want to execute m1() & m3() respectively, is it possible that t1 & t2 
   execute m1() & m3() simultaneously or not? 
   Ans:- Yes
   
    Case3:-
    suppose t1 & t2 want to execute m3() & m4() respectively, is it possible that t1 & t2 
    execute m3() & m4() simultaneously or not?
    Ans:- NO
    
    Case4:-
    suppose t1 & t2 want to execute m3() & m6() respectively, is it possible that t1 & t2 
    execute m3() & m6() simultaneously or not?
    Ans:- Yes
    
    Case5:-
    suppose t1 & t2 want to execute m1() & m5() respectively, is it possible that t1 & t2 
    execute m1() & m5() simultaneously or not?
    Ans:- Yes
   
   Data Race:- According to Java specification, Updation of int value is an atomic operation. 
   			   so, you should not use synchronized keyword or any lock to achieve 
   			   thread safety but for long and double value java specification does not 
   			   guarantee for atomic operation, programmer should take care to achieve thread
   			   safety.
   			   
   Race condition:- 1. Check & update.
   					2. Read & update.
   					
 * */
public class LockInThread {
public static void m1() {
	synchronized(LockInThread.class){
	System.out.println("From static m1()");
	}
}
public static synchronized void m2() {
	System.out.println("From static m2()");
}
public void m3() {
	LockInThread lock=new LockInThread();
	synchronized(lock){
	System.out.println("From m3()");
	}
}
public synchronized void m4() {
	System.out.println("From m4()");
}
}
