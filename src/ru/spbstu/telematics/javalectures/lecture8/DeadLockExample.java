package ru.spbstu.telematics.javalectures.lecture8;

public class DeadLockExample {

	public static void main(String[] args) {
		final Object lock1 = new Object();
		final Object lock2 = new Object();

		new Thread(new Runnable() {

			@Override
			public void run() {
				while (!Thread.currentThread().isInterrupted()) {
					synchronized (lock2) {
						synchronized (lock1) {
							System.out.println(Thread.currentThread().getName()
									+ ": I'm still alive!");

						}
					}
				}

			}

		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				while (!Thread.currentThread().isInterrupted()) {
					synchronized (lock1) {
						synchronized (lock2) {
							System.out.println(Thread.currentThread().getName()
									+ ": I'm still alive!");

						}
					}
				}
			}

		}).start();

	}

}
