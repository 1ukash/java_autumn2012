package ru.spbstu.telematics.javalectures.lecture9;

public class RendezvousObject {

	private Integer input = null;
	private String result = null;
	
	public synchronized String call(Integer i) {
		
		input = i;
		notify();
		
		while ( result == null ) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		String local = result;
		result = null;
		return local;
	}

	public synchronized void service() {
		while ( input == null ) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		if (input % 2 == 0) {
			result = "even";
		} else {
			result = "odd";
		}
		
		notify();
		
		input = null;
	}

}
