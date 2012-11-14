package ru.spbstu.telematics.javalectures.lecture9;

public class ServiceThread implements Runnable {
	private RendezvousObject robj;
	
	public ServiceThread(RendezvousObject robj) {
		this.robj = robj;
	}

	@Override
	public void run() {
		while(!Thread.currentThread().isInterrupted()) {
			robj.service();
		}
	}

}
