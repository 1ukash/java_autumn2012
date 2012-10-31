package ru.spbstu.telematics.javalectures.lecture7;

public class FooObject {
	private String name;
	private int val;
	
	public int publicInt = 1;

	public FooObject() {
	}

	public FooObject(String name) {
		this.name = name;
	}

	public FooObject(String name, int val) {
		this.name = name;
		this.val = val;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
	
	private void privateMethod() {
		
	}
}
