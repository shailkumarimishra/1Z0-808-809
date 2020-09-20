package multithreading;

public class Test {
	public static void main(String[] args) {
		ThreadDemo demo = new ThreadDemo();
		demo.setName("shail");
		demo.setPriority(10);
		demo.start();// run() gets triggered internally when start() is called.
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i + " " + Thread.currentThread().getPriority());
		}

	}
}
