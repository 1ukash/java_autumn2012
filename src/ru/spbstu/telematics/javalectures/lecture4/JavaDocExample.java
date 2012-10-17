package ru.spbstu.telematics.javalectures.lecture4;

/**
 * <p>
 * It is a class which shows how to use <b>javadoc</b>
 * <p>
 * 
 * <p>
 * Javadoc is used for documenting code
 * </p>
 * 
 * @author lukash
 */
public class JavaDocExample {
	/**
	 * very important field
	 */
	private Object field1;
	private Object field2;
	private Object field3;

	/**
	 * getter method
	 * @return field1 object
	 */
	public Object getField1() {
		return field1;
	}

	/**
	 * setter method
	 * 
	 * @param field1 object to set
	 */
	public void setField1(Object field1) {
		this.field1 = field1;
	}

	public Object getField2() {
		return field2;
	}

	public void setField2(Object field2) {
		this.field2 = field2;
	}

	public Object getField3() {
		return field3;
	}

	public void setField3(Object field3) {
		this.field3 = field3;
	} 
	
	private void foo() {
		// it is a comment
		
		/*
		 * block comment
		 */
		System.out.print("hello");
	}

}
