package ru.spbstu.telematics.javalectures.lecture12;

public class ListenerExample {
	
	static class EventListener1 implements DecadeListener {
		@Override
		public void decadeEvent(int i) {
			System.out.println(getClass().getCanonicalName()+ ": " + i);
		}	
	}
	
	static class EventListener2 implements DecadeListener {
		@Override
		public void decadeEvent(int i) {
			System.out.println(getClass().getCanonicalName()+ ": " + i);			
		}	
	}
	
	public static void main(String[] args) {
		Generator g = new Generator();
		Thread t = new Thread(g);
		t.start();

		g.addListener(new EventListener1());
		g.addListener(new EventListener2());
		
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
