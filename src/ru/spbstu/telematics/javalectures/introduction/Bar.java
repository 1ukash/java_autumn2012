package ru.spbstu.telematics.javalectures.introduction;

public class Bar extends Foo {
	
	private void baz() {
		
	}

	@Override
	public int foo1() {
		// do smth
		return super.foo1();
	}

	public Bar(int a, int b, String s, double x, float f) {
		super(a, b, s, x, f);
		baz();
	}
}
