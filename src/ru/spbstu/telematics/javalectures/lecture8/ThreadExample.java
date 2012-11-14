package ru.spbstu.telematics.javalectures.lecture8;

public class ThreadExample {
	
	public static void main(String[] args) {
		SharedObject counter = new SharedObject();
		System.out.println("Main thread started: "
				+ Thread.currentThread().getName() + ", id="
				+ Thread.currentThread().getId());
		// t.setDaemon(true);
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(new NamePrinter(counter));
			t.start();
			System.out.println("Thread " + t.getName() + " has started");
		}
		// try {
		// t.join();
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
	}
}
