package ru.spbstu.telematics.javalectures.lecture8;

public class NamePrinter implements Runnable {

	private SharedObject counter;

	public NamePrinter(SharedObject counter) {
		this.counter=counter;
	}

	@Override
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
//			counter.setSharedCounter(counter.getSharedCounter()+1);
			int val = counter.incrementAndGet();
			System.out.println("Thread name=" + Thread.currentThread().getName() +", id=" + Thread.currentThread().getId()+ ", counter = " + val);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		}
	}

}
