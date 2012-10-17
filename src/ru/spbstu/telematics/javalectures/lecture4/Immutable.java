package ru.spbstu.telematics.javalectures.lecture4;

public class Immutable {
	public static void main(String[] args) {
		String a = "abc";
		
		if (a == (a+"d")) {
			System.out.println("links are equal");
		} else {
			System.out.println("links are NOT equal");
		}
		
		String c = "ab";
		String b = "ab";
		
		String r = (c.equals(b)) ? "Equals!" : "Not equals!";
		System.out.println(r);
		
		Object o = new Object();
		System.out.println(o);
		System.out.println(c.toString());
		
		StringBuilder builder = new StringBuilder();
		builder.append(r).append('\t').append(c);
		
		System.out.println(builder.toString());
		
		
	}
}
