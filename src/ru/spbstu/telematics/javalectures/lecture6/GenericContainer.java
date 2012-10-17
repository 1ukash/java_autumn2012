package ru.spbstu.telematics.javalectures.lecture6;

public class GenericContainer<T,A> {
	
	private T internal;
	private A[] another = (A[]) new Object[10];
	

	public GenericContainer() {
	}

	public T getInternal() {
		return internal;
	}

	public void setInternal(T internal) {
		this.internal = internal;
	}
	
	public static<X> X getMiddle(X[] a) {
		return a[a.length / 2];
	}
}
