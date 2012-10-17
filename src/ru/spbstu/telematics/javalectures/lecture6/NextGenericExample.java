package ru.spbstu.telematics.javalectures.lecture6;

public class NextGenericExample<T extends Comparable<T>> {
	
	private T internal;
	
	private void foo(T internal2) {
		int compareTo = internal.compareTo(internal2);
	}

	public T getInternal() {
		return internal;
	}

	public void setInternal(T internal) {
		this.internal = internal;
	}
	
}
