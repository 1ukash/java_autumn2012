package ru.spbstu.telematics.javalectures.lecture9;

public class Main {
	public static void main(String[] args) {
		RendezvousObject robj = new RendezvousObject();
		CallerThread cth = new CallerThread(robj);
		ServiceThread sth = new ServiceThread(robj);
		
		new Thread(cth, "Caller").start();
		new Thread(sth, "Service").start();
	}
}
