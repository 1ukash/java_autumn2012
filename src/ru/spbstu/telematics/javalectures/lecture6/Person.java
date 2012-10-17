package ru.spbstu.telematics.javalectures.lecture6;

public class Person implements Comparable<Person>{
	private int id;
	private int age;
	private String name;
	

	public Person() {
	}

	public Person(int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
		return new Integer(age).compareTo(new Integer(o.age));
	}
	
	@Override
	public String toString() {
		return "id=" + id +",name=" + name;
	}

}
