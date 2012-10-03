package ru.spbstu.telematics.javalectures.lecture5;

public class AnObject implements Cloneable {
	private int aField1;
	private long aField2;
	private Object internalObject;

	public AnObject(int aField1, long aField2, Object internalObject) {
		this.aField1 = aField1;
		this.aField2 = aField2;
		this.internalObject = internalObject;
	}

	public int getaField1() {
		return aField1;
	}

	public void setaField1(int aField1) {
		this.aField1 = aField1;
	}

	public long getaField2() {
		return aField2;
	}

	public void setaField2(long aField2) {
		this.aField2 = aField2;
	}

	public Object getInternalObject() {
		return internalObject;
	}

	public void setInternalObject(Object internalObject) {
		this.internalObject = internalObject;
	}

	@Override
	public String toString() {
		return "field1=" + aField1 + ",field2=" + aField2 +",obj=" + internalObject;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		AnObject o = (AnObject) super.clone();
//		o.internalObject = new Object();
		return o;
	}
}
