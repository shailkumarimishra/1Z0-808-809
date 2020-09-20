
package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExchangerDemo {

	public static void main(String[] args) {
		Exchanger<String> exchanger=new Exchanger<>();
		ExecutorService service=Executors.newFixedThreadPool(2);
		Future<Integer> r1 = service.submit(new Task(exchanger));
		Future<Integer> r2 = service.submit(new Task(exchanger));
//		Future<Integer> r3 = service.submit(new Task(exchanger));
		try {
			System.out.println(r1.get());
			System.out.println(r2.get());
//			System.out.println(r3.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}
class Task implements Callable<Integer>{
	private Exchanger<String> exchanger;
	private String item="10";
	public Task(Exchanger<String> exchanger) {
		super();
		this.exchanger = exchanger;
	}

	@Override
	public Integer call() throws Exception {
		String exchange = exchanger.exchange(item);
		return Integer.valueOf(exchange);
	}

		
}