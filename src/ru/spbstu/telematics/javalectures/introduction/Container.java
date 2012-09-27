package ru.spbstu.telematics.javalectures.introduction;

public class Container {
	private int a;
	private String b;
	private long num;

	
	public Container() {
	}
	
	

	public Container(int a, String b, long num) {
		super();
		this.a = a;
		this.b = b;
		this.num = num;
	}



	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setBAsString(String b) {
		this.b = b;
	}

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

}
