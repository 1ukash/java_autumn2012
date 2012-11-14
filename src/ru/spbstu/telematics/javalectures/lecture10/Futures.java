package ru.spbstu.telematics.javalectures.lecture10;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Futures {
	
	static ExecutorService service = Executors.newSingleThreadExecutor();
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Future<Long> f = service.submit(new Callable<Long>() {

			@Override
			public Long call() throws Exception {
				long r = 0;
				for (int i = 0; i < 10; i++) {
					r ++;
					Thread.sleep(500);
				}
				return r;
			}
		});
		

		while (!f.isDone()) {
			System.out.println("task still not done");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		Long result = f.get();
		System.out.println("result is " + result);
		
	}
	
}
