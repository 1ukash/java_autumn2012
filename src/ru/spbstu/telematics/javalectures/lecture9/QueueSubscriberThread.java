package ru.spbstu.telematics.javalectures.lecture9;


public class QueueSubscriberThread implements Runnable {
	private BlockingQueue<Integer> queue;
	
	public QueueSubscriberThread(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while(!Thread.currentThread().isInterrupted()) {
			Integer take = queue.take();
			System.out.println("Took: " + take);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
