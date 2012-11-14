package ru.spbstu.telematics.javalectures.lecture9;

import java.util.LinkedList;

public class BlockingQueue<T> {

	private LinkedList<T> elements = new LinkedList<>();
	private int capacity = 10;
	
	public synchronized void put(T el) {
		while (elements.size() == capacity){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		elements.add(el);
		notify();
	}
	
	public synchronized T take() {
		
		while (elements.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		T el = elements.removeFirst();
		notify();
		return el;
	}
}
