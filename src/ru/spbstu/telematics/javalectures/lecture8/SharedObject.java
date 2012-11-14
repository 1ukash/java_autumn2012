package ru.spbstu.telematics.javalectures.lecture8;

public class SharedObject {
	private int sharedCounter;

	public synchronized int getSharedCounter() {
		return sharedCounter;
	}

	public synchronized void setSharedCounter(int sharedCounter) {
		this.sharedCounter = sharedCounter;
	}
	
	public int incrementAndGet() {
		int val;
		synchronized (this) {
			this.sharedCounter ++;
			val = sharedCounter;
		}
		return val;
	}
	
}
