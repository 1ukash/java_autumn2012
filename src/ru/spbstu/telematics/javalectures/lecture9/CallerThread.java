package ru.spbstu.telematics.javalectures.lecture9;

import java.util.Random;

public class CallerThread implements Runnable {

	private RendezvousObject robj;
	
	public CallerThread(RendezvousObject robj) {
		super();
		this.robj = robj;
	}

	@Override
	public void run() {
		while(!Thread.currentThread().isInterrupted()) {
			
			int i = new Random().nextInt(10);

			String s = robj.call(i);
			System.out.println("res=" + s + ", i=" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("I have slept a little bit...");
		}
	}

}
