package ru.spbstu.telematics.javalectures.lecture11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectPersistence {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("/tmp/fooobject.data");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		
		FooObject foo = new FooObject("foo1", 10, 12, new FooObject("test", 1, 2, null));
		
		os.writeObject(foo);
		os.close();
		
		ObjectInputStream is = new ObjectInputStream(new FileInputStream("/tmp/fooobject.data"));
		FooObject read = (FooObject) is.readObject();
		System.out.println(read.getName());
		System.out.println(read.getFriend().getName());
		is.close();
	}
}
