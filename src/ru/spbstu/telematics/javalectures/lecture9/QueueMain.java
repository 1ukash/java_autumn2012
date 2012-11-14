package ru.spbstu.telematics.javalectures.lecture9;

public class QueueMain {
	public static void main(String[] args) {
		BlockingQueue<Integer> q = new BlockingQueue<>();
		QueuePublisherThread t1 = new QueuePublisherThread(q);
		QueueSubscriberThread t2 = new QueueSubscriberThread(q);
		
		new Thread(t1, "Caller").start();
		new Thread(t2, "Service").start();
	}
}
