package ru.spbstu.telematics.javalectures.lecture10;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RWLock {
	static ReadWriteLock rw = new ReentrantReadWriteLock();
	
	static long counter;
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			final int n = i;
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					if (n % 2 == 0) {
						read();
					} else {
						write();
					}
				}
			}, (i %2 == 0) ? ("Reader " + i) : ("Writer " + i)).start();
		}
	}
	
	static void read() {
		while (!Thread.currentThread().isInterrupted()) {
			Lock readLock = rw.readLock();
			long val;
			readLock.lock();
			try {
				val = counter;
			} finally {
				readLock.unlock();
			}
			System.out.println(Thread.currentThread().getName() + ": " + val);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	static void write() {
		while (!Thread.currentThread().isInterrupted()) {
			while (!Thread.currentThread().isInterrupted()) {
				Lock readLock = rw.writeLock();
				long val;
				readLock.lock();
				try {
					counter ++;
					val = counter;
				} finally {
					readLock.unlock();
				}
				System.out.println(Thread.currentThread().getName() + ": " + val);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
