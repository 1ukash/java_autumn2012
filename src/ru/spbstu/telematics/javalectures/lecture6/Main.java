package ru.spbstu.telematics.javalectures.lecture6;

import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		withoutGenerics();
		withGenerics();
		comparableExanple();
	}

	private static void comparableExanple() {
		NextGenericExample<Person> o = new NextGenericExample<>();
		o.setInternal(new Person());
	}

	private static void withGenerics() {
		GenericContainer<String,Integer> c = new GenericContainer<>();
		c.setInternal("str");
		
		String str = c.getInternal();
		System.out.println(str);
		
//		GenericContainer<String, int> c;
		if (c instanceof GenericContainer) {
			
		}
		
		String[] arr = new String[10];
		Double[] arr2 = new Double[10];
		
		String middle = GenericContainer.getMiddle(arr);
		GenericContainer.getMiddle(arr2);
	}

	private static void withoutGenerics() {
		Container c = new Container();
		
		String s = new String("it is a string");
		c.setInternal(s);
		//...
		
		String internal2 = (String) c.getInternal();
		System.out.println(internal2);
		
		c.setInternal(new Integer(5));
		// ...
//		String internal3 = (String) c.getInternal();
		
		Vector v = new Vector();
		v.add(new Integer(1));
		v.add(new Double(0.1));
		
		for (int i = 0; i < v.size(); i++) {
			Integer o = (Integer) v.get(i);
		}
	}
}
