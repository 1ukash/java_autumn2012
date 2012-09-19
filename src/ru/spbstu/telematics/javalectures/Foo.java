package ru.spbstu.telematics.javalectures;

public class Foo {
	private int a = 1, b;
	private final Object o = new Object();
	public String s;
	protected double x = 0.5;
	float f;
	private final int anotherOne;
	
	static int c;
	
	{
		a = 2;
	}
	
	static {
		c = 4;
	}
	
	public Foo() {
		a = 1;
		anotherOne = 5;
	}
	
	public Foo(int a, int b, String s, double x, float f) {
		this.a = a;
		this.b = b;
		this.s = s;
		this.x = x;
		this.f = f;
		anotherOne = 5;
	}

	static void staticMethod() {
		int local;
	}
	
	private final void foo() {
		System.out.print(s);
	}
	
    public int foo1() {
		return a;
	}
    
    protected String foo2() {
    	return s + " is a string";
    }
    
    void foo3() {
    	
    }
    
    public static void main(String[] args) {
		Foo foo = new Foo();
		Foo foo2 = new Foo(1, 2, "", 3, 4);
		foo.foo1();
	}
}
