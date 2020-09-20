package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableVsRunnable {

	public static void main(String[] args) {
		Callable<String> callable=()->{
			return "shail";
		};
		Runnable run=()->{
			System.out.println("Runnable");
		};
		ExecutorService service=Executors.newFixedThreadPool(2);
		Future<String> result = service.submit(callable);
		service.submit(run);
		try {
			System.out.println(result.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
