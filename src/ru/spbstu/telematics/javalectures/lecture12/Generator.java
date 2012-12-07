package ru.spbstu.telematics.javalectures.lecture12;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Generator implements Runnable {
	
	private List<DecadeListener> listeners = new LinkedList<>();

	@Override
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			int i = new Random().nextInt();
			if (i % 10 == 0) {
				fireDecadeHappened(i);
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private synchronized void fireDecadeHappened(int i) {
		for (DecadeListener l : listeners) {
			l.decadeEvent(i);
		}
	}
	
	public synchronized void addListener(DecadeListener l) {
		listeners.add(l);
	}
	
	public synchronized void removeListener(DecadeListener l) {
		listeners.remove(l);
	}
}
