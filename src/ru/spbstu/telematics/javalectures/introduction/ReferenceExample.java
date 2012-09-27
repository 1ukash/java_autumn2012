package ru.spbstu.telematics.javalectures.introduction;

public class ReferenceExample {
	public static void main(String[] args) {
		Object o = new Object();
		System.out.println(o);
		
		Object veryLongVar = new Object();
		
		foo(veryLongVar);
		Container c = new Container();
		c.setBAsString("dt");
	}
	
	private static void foo(Object veryLongVar) {
		// TODO Auto-generated method stub

	}
}
