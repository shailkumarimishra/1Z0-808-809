package multithreading;

public class LockTest {

	public static void main(String[] args) {
		LockInThread lock= new LockInThread();
		Runnable run=()->{lock.m1();lock.m2();};
		Runnable run1=()->{lock.m3();lock.m4();};
		Runnable run2=()->{lock.m1();lock.m3();};
		Runnable run3=()->{lock.m1();lock.m2();lock.m3();lock.m4();};
		Thread t1=new Thread(run3);
		Thread t2=new Thread(run3);
		Thread t3=new Thread(run3);
		Thread t4=new Thread(run3);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	

	}

}
