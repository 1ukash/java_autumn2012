package ru.spbstu.telematics.javalectures.lecture11;

import java.io.File;
import java.io.Serializable;

public class FooObject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1942054732524358852L;
	
	private String name;
	private int id;
	private long age;
	private FooObject friend;
	private transient File source;
	
	public FooObject(String name, int id, long age, FooObject friend) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.friend = friend;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public FooObject getFriend() {
		return friend;
	}

	public void setFriend(FooObject friend) {
		this.friend = friend;
	}

}
