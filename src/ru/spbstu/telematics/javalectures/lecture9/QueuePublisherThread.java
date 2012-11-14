package ru.spbstu.telematics.javalectures.lecture9;

import java.util.Random;

public class QueuePublisherThread implements Runnable {

	private BlockingQueue<Integer> queue;
	
	public QueuePublisherThread(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while(!Thread.currentThread().isInterrupted()) {
			int i = new Random().nextInt(10);
			queue.put(i);
			System.out.println("Put: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
