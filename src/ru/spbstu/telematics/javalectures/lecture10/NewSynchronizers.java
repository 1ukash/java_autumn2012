package ru.spbstu.telematics.javalectures.lecture10;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NewSynchronizers {
	
	static Lock lock = new ReentrantLock();
	private static Condition cond;
	
	static {
		cond = lock.newCondition();
		
//		cond.await();
//		cond.signal();
	}
	
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (!Thread.currentThread().isInterrupted()) {
					shared();
				}
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (!Thread.currentThread().isInterrupted()) {
					shared();
				}
			}
		}).start();
	}
	
	static int x = 0;
	static void shared() {
		int oldVal;
		lock.lock();
		try {
			oldVal = x;
			x ++;
		} finally {
			lock.unlock();
		}
		
		System.out.println(Thread.currentThread().getName() + ":" + oldVal);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		if (lock.tryLock()) {
//			System.out.println("got lock!");
//		}
	}
	
}
