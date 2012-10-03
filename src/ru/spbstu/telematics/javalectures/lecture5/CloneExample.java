package ru.spbstu.telematics.javalectures.lecture5;

public class CloneExample {
	public static void main(String[] args) throws CloneNotSupportedException {
		AnObject obj = new AnObject(1, 1, new Object());
		System.out.println(obj);
		
		AnObject obj2 = (AnObject) obj.clone();
		
		if (obj != obj2) {
			System.out.println("References are different!");
		}
		
		if (obj.getInternalObject() == obj2.getInternalObject()) {
			System.out.println("Internal references are equal!");
		}
	}
}
